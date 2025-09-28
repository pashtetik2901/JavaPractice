package work_enum;

public enum Season {
    WINTER(-10){
        @Override
        public String getDescription(){
            return "Холодное время года";
        }
    },
    SPRING(7){
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(20){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(6){
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };


    private final double avg_temp;

    Season(double avg_temp){
        this.avg_temp = avg_temp;
    }

    public String getDescription(){
        return "Теплое время года";
    }

    public String getFavorite(Season season){
        if (season == WINTER){
            return "Мое люимое время года";
        }
        else{
            return "Не самое любимое время года";
        }
    }
}
