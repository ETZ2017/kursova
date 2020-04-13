package edu.zhenia.labtwodb.forms;

public class SearchForm {
    private String searchField;
    private String searchFieldReserve;
    private String searchFieldReserve2;
    private String searchFieldReserve3;
    private String searchFieldReserve4;

    public SearchForm() {
    }

    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public String getSearchFieldReserve() {
        return searchFieldReserve;
    }

    public void setSearchFieldReserve(String searchFieldReserve) {
        this.searchFieldReserve = searchFieldReserve;
    }

    public String getSearchFieldReserve2() {
        return searchFieldReserve2;
    }

    public void setSearchFieldReserve2(String searchFieldReserve2) {
        this.searchFieldReserve2 = searchFieldReserve2;
    }

    public String getSearchFieldReserve3() {
        return searchFieldReserve3;
    }

    public void setSearchFieldReserve3(String searchFieldReserve3) {
        this.searchFieldReserve3 = searchFieldReserve3;
    }

    public String getSearchFieldReserve4() {
        return searchFieldReserve4;
    }

    public void setSearchFieldReserve4(String searchFieldReserve4) {
        this.searchFieldReserve4 = searchFieldReserve4;
    }

    @Override
    public String toString() {
        return "SearchForm{" +
                "searchField='" + searchField + '\'' +
                ", searchFieldReserve='" + searchFieldReserve + '\'' +
                ", searchFieldReserve2='" + searchFieldReserve2 + '\'' +
                '}';
    }
}
