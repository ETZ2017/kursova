package edu.zhenia.labtwodb.forms;

public class ContestForm {
    private String contest;
    private String description;

    public ContestForm(String contest, String description) {
        this.contest = contest;
        this.description = description;
    }

    public ContestForm() {
    }

    public String getcontest() {
        return contest;
    }

    public void setcontest(String contest) {
        this.contest = contest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ContestForm{" +
                "contest='" + contest + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
