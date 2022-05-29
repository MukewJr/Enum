public enum Oblast {
        BATKEN("Batken","Leilek",3,17000,548247),
        OSH("Osh","Osh",7,29200,1114000),
        DJALAL_ABAD("Djalal-Abad","Djalal-Abad",8,33700,1214000),
        TALAS("Talas","Talas",4,11400,263500),
        CHUY("Chuy","Bishkek",8,20200,959884),
        NARYN("Naryn","Naryn",5,45200,287000),
        YSSYK_KOL("Yssyk-Kul","Karakol",5,43100,489800);
        private String name;
        private String capital_town;
        private int regions;
        private int area;
        private int population;

        Oblast(String name, String capital_town,int regions, int area, int population) {
                this.name = name;
                this.capital_town = capital_town;
                this.regions=regions;
                this.area = area;
                this.population = population;
        }

        Oblast() {

        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getCapital_town() {
                return capital_town;
        }

        public int getRegions() {
                return regions;
        }

        public void setRegions(int regions) {
                this.regions = regions;
        }

        public void setCapital_town(String capital_town) {
                this.capital_town = capital_town;
        }

        public int getArea() {
                return area;
        }

        public void setArea(int area) {
                this.area = area;
        }

        public int getPopulation() {
                return population;
        }

        public void setPopulation(int population) {
                this.population = population;
        }

        @Override
        public String toString() {
                return "Oblast{" +
                        "name='" + name + '\'' +
                        ", capital_town='" + capital_town + '\'' +
                        ", regions=" + regions +
                        ", area=" + area +
                        ", population=" + population +
                        "} ";
        }
}
