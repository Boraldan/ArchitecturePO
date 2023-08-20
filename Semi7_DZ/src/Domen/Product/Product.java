package Domen.Product;

import Domen.Provider;

public class Product {
    private static int inCounter;
    private int id;
    private String name;
    private Type type;
    private Category category;
    private SubCat subCat;
    private float price;
    private long volunInStore;
    private String storageLive;
    private int store;
    private boolean dutyFree;
    private Provider provider;

    public Product(String name, Type type, Category category, SubCat subCat, float price,
                   long volunInStore, String storageLive, int store, boolean dutyFree, Provider provider) {
        this.id = ++inCounter;
        this.name = name;
        this.type = type;
        this.category = category;
        this.subCat = subCat;
        this.price = price;
        this.volunInStore = volunInStore;
        this.storageLive = storageLive;
        this.store = store;
        this.dutyFree = dutyFree;
        this.provider = provider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public SubCat getSubCat() {
        return subCat;
    }

    public void setSubCat(SubCat subCat) {
        this.subCat = subCat;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getVolunInStore() {
        return volunInStore;
    }

    public void setVolunInStore(long volunInStore) {
        this.volunInStore = volunInStore;
    }

    public String getStorageLive() {
        return storageLive;
    }

    public void setStorageLive(String storageLive) {
        this.storageLive = storageLive;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public boolean isDutyFree() {
        return dutyFree;
    }

    public void setDutyFree(boolean dutyFree) {
        this.dutyFree = dutyFree;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
