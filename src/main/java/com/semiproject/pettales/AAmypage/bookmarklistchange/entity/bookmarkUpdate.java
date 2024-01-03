package com.semiproject.pettales.AAmypage.bookmarklistchange.entity;

import com.semiproject.pettales.AAmypage.userupdate.entity.UserUpdate;
import jakarta.persistence.*;

@Entity
public class bookmarkUpdate {
        @Id
        @Column(name = "BOOKMARK_CODE")
        private Integer bookmarkCode;

        @ManyToOne
        @JoinColumn(name = "COMPANY_CODE")
        private companyTable CompanyTable;

        @ManyToOne
        @JoinColumn(name = "USER_CODE")
        private UserUpdate userUpdate;

        @Column(name = "BOOKMARKED")
        private Boolean bookmarked;

    public bookmarkUpdate() {
    }

    public bookmarkUpdate(Integer bookmarkCode, com.semiproject.pettales.AAmypage.bookmarklistchange.entity.companyTable companyTable, UserUpdate userUpdate, Boolean bookmarked) {
        this.bookmarkCode = bookmarkCode;
        this.CompanyTable = companyTable;
        this.userUpdate = userUpdate;
        this.bookmarked = bookmarked;
    }

    public Integer getBookmarkCode() {
        return bookmarkCode;
    }

    public void setBookmarkCode(Integer bookmarkCode) {
        this.bookmarkCode = bookmarkCode;
    }

    public companyTable getCompanyTable() {
        return CompanyTable;
    }

    public void setCompanyTable(companyTable companyTable) {
        CompanyTable = companyTable;
    }

    public UserUpdate getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(UserUpdate userUpdate) {
        this.userUpdate = userUpdate;
    }

    public Boolean getBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(Boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    @Override
    public String toString() {
        return "bookmarkUpdate{" +
                "bookmarkCode=" + bookmarkCode +
                ", CompanyTable=" + CompanyTable +
                ", UserUpdate=" + userUpdate +
                ", bookmarked=" + bookmarked +
                '}';
    }
}
