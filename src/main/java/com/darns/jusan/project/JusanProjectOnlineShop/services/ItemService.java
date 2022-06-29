package com.darns.jusan.project.JusanProjectOnlineShop.services;

import com.darns.jusan.project.JusanProjectOnlineShop.entity.Brand;
import com.darns.jusan.project.JusanProjectOnlineShop.entity.Category;
import com.darns.jusan.project.JusanProjectOnlineShop.entity.Item;
import com.darns.jusan.project.JusanProjectOnlineShop.model.ItemRecord;
import com.darns.jusan.project.JusanProjectOnlineShop.model.Type;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ItemService {

    Item addItem(Item item);
    List<Item> getAllItems();
    List<Item> findByType(Type type,String name);
    Item getItem(Long id);
    void deleteItem(Item item);
    Item saveItem(Item item);
    List<ItemRecord> sortBy(String val,Type type, String c_name,Long b_id,double f , double t);
    List<ItemRecord> findByAmounts(Type type, String c_name,double f,double s);
    List<ItemRecord> findByBrand(Type type, String c_name,Long id);
    List<Brand> getAllBrands();
    Brand addBrand(Brand brand);
    Brand saveBrand(Brand brand);
    Brand getBrand(Long id);
    void deleteBrand(Brand brand);
    Category addCategory(Category c);

    Category getCategory(Long id);
    List<Category> getAllCategory();



    double totalSum(HttpServletRequest req);

}
