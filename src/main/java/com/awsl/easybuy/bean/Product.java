package com.awsl.easybuy.bean;

import org.apache.ibatis.type.Alias;

/**
 * @author tjy
 */

public class Product {




        private Integer id;
        private String name;
        private String description;
        private Double price;
        private Integer stock;
        private Integer categoryLevel1Id;
        private Integer categoryLevel2Id;
        private Integer categoryLevel3Id;
        private String fileName;
        private Integer isDelete;


        public long getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }


        public double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }


        public long getStock() {
            return stock;
        }

        public void setStock(Integer stock) {
            this.stock = stock;
        }


        public long getCategoryLevel1Id() {
            return categoryLevel1Id;
        }

        public void setCategoryLevel1Id(Integer categoryLevel1Id) {
            this.categoryLevel1Id = categoryLevel1Id;
        }


        public long getCategoryLevel2Id() {
            return categoryLevel2Id;
        }

        public void setCategoryLevel2Id(Integer categoryLevel2Id) {
            this.categoryLevel2Id = categoryLevel2Id;
        }


        public long getCategoryLevel3Id() {
            return categoryLevel3Id;
        }

        public void setCategoryLevel3Id(Integer categoryLevel3Id) {
            this.categoryLevel3Id = categoryLevel3Id;
        }


        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }


        public long getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
        }

    public Product() {
    }

    public Product(Integer id, String name, String description, Double price, Integer stock, Integer categoryLevel1Id, Integer categoryLevel2Id, Integer categoryLevel3Id, String fileName, Integer isDelete) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.categoryLevel1Id = categoryLevel1Id;
        this.categoryLevel2Id = categoryLevel2Id;
        this.categoryLevel3Id = categoryLevel3Id;
        this.fileName = fileName;
        this.isDelete = isDelete;
    }

}

