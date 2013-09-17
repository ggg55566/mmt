package lemon.web.system.mapper;

import java.util.List;

import lemon.web.system.bean.Menu;

import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.scripting.defaults.RawLanguageDriver;
import org.springframework.stereotype.Repository;


/**
 * system menu repository
 * 
 * @author lemon
 * @date Mar 17, 2012 3:02:09 PM
 * @version 1.0
 * 
 */
@Repository
public interface MenuMapper {
	
	/**
	 * add menu
	 * 
	 * @param menu
	 */
	@Lang(RawLanguageDriver.class)
	void addMenu(Menu menu);
	
	/**
	 * delete menu by id
	 * @param menu_id
	 */
	@Lang(RawLanguageDriver.class)
	void deleteMenu(int menu_id);
	
	/**
	 * edit menu
	 * @param menu
	 */
	void editMenu(Menu menu);
	
	/**
	 * get menu by menu id
	 * @param menu_id
	 * @return
	 */
	@Lang(RawLanguageDriver.class)
	Menu getMenu(int menu_id);
	
	/**
	 * get third menu by menu URL and super menu URL
	 * @param url
	 * @param superUrl
	 * @return
	 */
	@Lang(RawLanguageDriver.class)
	Menu getLeafMenuByUrl(@Param("url") String url,
			@Param("superUrl") String superUrl);
	
	/**
	 * get all menu list
	 * 
	 * @return
	 */
	@Lang(RawLanguageDriver.class)
	List<Menu> getMenuList();
	
	/**
	 * get menu list by role id and level
	 * @param role_id
	 * @param level
	 * @return
	 */
	@Lang(RawLanguageDriver.class)
	List<Menu> getMenuListByRole(@Param("role_id") int role_id,
			@Param("level") String level);

	/**
	 * get menu list by menu level
	 * @param level
	 * @return
	 */
	@Lang(RawLanguageDriver.class)
	List<Menu> getMenuListByLevel(String level);
	
	/**
	 * get leaf menu list by role id
	 * @param role_id
	 * @param supmenucode
	 * @return
	 */
	@Lang(RawLanguageDriver.class)
	List<Menu> getLeafMenuListByRole(@Param("role_id") int role_id,
			@Param("supmenucode") int supmenucode);
}
