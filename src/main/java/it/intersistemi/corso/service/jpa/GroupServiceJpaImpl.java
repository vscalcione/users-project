package it.intersistemi.corso.service.jpa;

import it.intersistemi.corso.repository.AuthorityRepository;
import it.intersistemi.corso.repository.GroupRepository;
import it.intersistemi.corso.repository.UserRepository;
import it.intersistemi.corso.model.entity.jpa.Authority;
import it.intersistemi.corso.model.entity.jpa.Group;
import it.intersistemi.corso.dto.AuthorityDto;
import it.intersistemi.corso.dto.GroupDto;
import it.intersistemi.corso.dto.UserDto;
import it.intersistemi.corso.service.GroupService;
import it.intersistemi.corso.mapper.AuthorityMapper;
import it.intersistemi.corso.mapper.GroupMapper;
import it.intersistemi.corso.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupServiceJpaImpl
		extends AbstractCrudServiceJpaImpl<Group, String, GroupDto, GroupRepository, GroupMapper>
		implements GroupService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AuthorityRepository authorityRepository;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private AuthorityMapper authorityMapper;

	@Autowired
	public GroupServiceJpaImpl(GroupRepository repository, GroupMapper mapper) {
		super(repository, mapper);
	}

	@Override
	protected String getPK(Group e) {
		return e.getGroupName();
	}

	@Override
	@Transactional
	public void addAuthority(String groupName, String authority) {
		Group group = super.repository.findById(groupName).orElse(null);
		if(group == null) {
			return;
		}
		Authority authorityE = this.authorityRepository.findById(authority).orElse(null);
		if(authorityE == null) {
			return;
		}
		group.getAuthorities().add(authorityE);
		authorityE.getGroups().add(group);
	}

	@Override
	@Transactional
	public void removeAuthority(String groupName, String authority) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public List<AuthorityDto> listAuthorities(String groupName) {
		Iterable<AuthorityDto> authoritiesIt = this.authorityMapper.entityToDto(this.authorityRepository.findByGroups_GroupName(groupName));
		if(authoritiesIt != null) {
			List<AuthorityDto> authorities = new ArrayList<>();
			authoritiesIt.forEach(authorities::add);
//			authoritiesIt.forEach(a -> authorities.add(a));
//			authoritiesIt.forEach((AuthorityDto a) -> {authorities.add(a);});
			return authorities;
		}
		return null;
	}

	@Override
	@Transactional
	public void addUser(String groupName, String username) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void removeUser(String groupName, String username) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public List<UserDto> listUsers(String groupName) {
		Iterable<UserDto> usersIt = this.userMapper.entityToDto(this.userRepository.findByGroupsGroupName(groupName));
		if(usersIt != null) {
			List<UserDto> users = new ArrayList<>();
			usersIt.forEach(users::add);
//			usersIt.forEach(u -> users.add(u));
//			usersIt.forEach((UserDto u) -> {users.add(u);});
			return users;
		}
		return null;
	}

}