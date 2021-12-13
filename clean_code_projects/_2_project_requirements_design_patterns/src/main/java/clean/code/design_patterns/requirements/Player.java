package clean.code.design_patterns.requirements;

public class Player {
    private String FirstName;
    private String LastName;
    private String team;
    private String country;
    private int height;
    private int weight;
    private String position;
    private int goals;
    private int assists;
    private int YellowCards;
    private int RedCards;

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getTeam() {
        return team;
    }

    public String getCountry() {
        return country;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getPosition() {
        return position;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getYellowCards() {
        return YellowCards;
    }

    public int getRedCards() {
        return RedCards;
    }

    private Player(Builder builder){
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.team = builder.team;
        this.country = builder.country;
        this.height = builder.height;
        this.weight = builder.weight;
        this.position = builder.position;
        this.goals = builder.goals;
        this.assists = builder.assists;
        this.YellowCards = builder.YellowCards;
        this.RedCards = builder.RedCards;
    }

    public static class Builder{
        private String FirstName;
        private String LastName;
        private String team;
        private String country;
        private int height;
        private int weight;
        private String position;
        private int goals;
        private int assists;
        private int YellowCards;
        private int RedCards;

        public Builder(String FirstName, String LastName){
            this.FirstName = FirstName;
            this.LastName = LastName;
        }

        public Builder setTeam(String team){
            this.team = team;
            return this;
        }

        public Builder setCountry(String country){
            this.country = country;
            return this;
        }

        public Builder setHeight(int height){
            this.height = height;
            return this;
        }

        public Builder setWeight(int weight){
            this.weight = weight;
            return this;
        }

        public Builder setPosition(String position){
            this.position = position;
            return this;
        }

        public Builder setGoals(int goals){
            this.goals = goals;
            return this;
        }

        public Builder setAssists(int assists){
            this.assists = assists;
            return this;
        }

        public Builder setYellowCards(int YellowCards){
            this.YellowCards = YellowCards;
            return this;
        }

        public Builder setRedCards(int RedCards){
            this.RedCards = RedCards;
            return this;
        }

        public Player build(){
            return new Player(this);
        }
    }
}
