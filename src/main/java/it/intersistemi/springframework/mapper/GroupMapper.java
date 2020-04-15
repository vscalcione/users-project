//package it.intersistemi.springframework.service.jdbc;
//
//import it.intersistemi.springframework.dao.jdbc.plain.mapper.dao.jdbc.UserRepository;
//import it.intersistemi.springframework.dto.AuthorityDto;
//import it.intersistemi.springframework.dto.UserDto;
//import it.intersistemi.springframework.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//public class UserServiceJdbcImpl
//	extends AbstractCrudServiceJdbcImpl<UserDto, Integer, UserRepository>
//	implements UserService {
//
//	@Autowired
//	public UserServiceJdbcImpl(UserRepository repository) {
//		super(repository);
//	}
//
//	@Override
//	public UserDto findByUserName(String userName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Transactional
//	@Override
//	public void addAuthority(String userName, String authority) {
//		super.repository.addAuthority(userName, authority);
//	}
//
//	@Transactional
//	@Override
//	public void removeAuthority(String userName, String authority) {
//		super.repository.removeAuthority(userName, authority);
//	}
//
//	@Transactional
//	@Override
//	public List<AuthorityDto> listAuthorities(String userName) {
//		return super.repository.listAuthorities(userName);
//	}
//
//}
ckage it.intersistemi.springframework.mapper;

import it.intersistemi.springframework.dao.jpa.Group;
import it.intersistemi.springframework.dto.GroupDto;
import org.springframework.stereotype.Component;

@Component
public class GroupMapper implements EntityDtoMapper<GroupDto, Group> {

	@Override
	public void dtoToEntity(GroupDto dto, Group e) {
		e.setGroupName(dto.getGroupName());
		e.setDescription(dto.getDescription());
	}

	@Override
	public Group createEntityInstance() {
		return new Group();
	}

	@Override
	public void entityToDto(Group e, GroupDto dto) {
		dto.setGroupName(e.getGroupName());
		dto.setDescription(e.getDescription());
	}

	@Override
	public GroupDto createDtoInstance() {
		return new GroupDto();
	}

}
