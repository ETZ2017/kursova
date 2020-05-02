package edu.zhenia.labtwodb.forms;

public class SearchForm {
    private String searchField;
    private String searchFieldReserve;
    private String searchFieldReserve2;
    private String searchFieldReserve3;
    private String searchFieldReserve4;
    private String dayBeg;
    private String monthBeg;
    private String yearBeg;
    private String dayEnd;
    private String monthEnd;
    private String yearEnd;

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

    public String getDayBeg() {
        return dayBeg;
    }

    public void setDayBeg(String dayBeg) {
        this.dayBeg = dayBeg;
    }

    public String getMonthBeg() {
        return monthBeg;
    }

    public void setMonthBeg(String monthBeg) {
        this.monthBeg = monthBeg;
    }

    public String getYearBeg() {
        return yearBeg;
    }

    public void setYearBeg(String yearBeg) {
        this.yearBeg = yearBeg;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getMonthEnd() {
        return monthEnd;
    }

    public void setMonthEnd(String monthEnd) {
        this.monthEnd = monthEnd;
    }

    public String getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(String yearEnd) {
        this.yearEnd = yearEnd;
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