package Task04AGE1202.AGEtemplate;

public class ageTemp {
    public static class AgeCalculator{
        protected int Date, Month, Year;

        public AgeCalculator(){
            this.Date=0;
            this.Month=0;
            this.Year=0;
        }
        public AgeCalculator(int date, int month, int year){
            this.Date=date;this.Month=month;this.Year=year;
        }

        
        public boolean isLeapYear(int year){
            if (year%4==0 && year%100==0 && year%400==0){
                return true;
            }
            return false;
        }
        private int provideLeapCOunt(int year1, int year2){
            int count=0;
            for(int i=year1;i<year2;i++){
                if(isLeapYear(i)){count+=1;}
            }
            return count;
        }

        

        public void setYear(int year){
            this.Year=year;
        }
        public boolean setMonth(int month){
            if(month>=1 && month<=12){this.Month=month;}
            else{return false;}
            return true;
        }
        public int setDate(int date){
            boolean leapY=isLeapYear(this.getYear());
            if(this.getMonth()==2){
                if(date>=1 && date<=28){
                    //updated down
                    this.Date=date;
                    return 1;
                    // if(!leapY){this.Date=date;}
                    // else{return -1;}
                }
                else if(date==29){
                    if(leapY){this.Date=date;}
                    else{return -1;}
                }
                else{return -2;}
            }
            else{
                if(date==31){
                    if(this.getMonth()==1 || this.getMonth()==3 || this.getMonth()==5 || this.getMonth()==7 || this.getMonth()==8 || this.getMonth()==10 || this.getMonth()==12){
                        this.Date=date;
                    }
                    else{return -3;}
                }
                else if(date>0 && date<31){
                    this.Date=date;
                    return 1;
                }
                else{return -4;}
            }
            return 1;
        }

        public int getDate(){return this.Date;}
        public int getMonth(){return this.Month;}
        public int getYear(){return this.Year;}


        public int diffDate(AgeCalculator obj1, AgeCalculator obj2){
            return (obj2.getDate() - obj1.getDate());
        }
        public int diffMonth(AgeCalculator obj1, AgeCalculator obj2){
            return (obj2.getMonth() - obj1.getMonth());
        }
        public int diffYear(AgeCalculator obj1, AgeCalculator obj2){
            return (obj2.getYear() - obj1.getYear());
        }

        

        private void forceSetMonth(int month){this.Month=month;}
        private void forceSetDate(int date){this.Date=date;}
        

        public void calculateAge(AgeCalculator obj1, AgeCalculator obj2){
            int leaps=provideLeapCOunt(obj1.getYear(), obj2.getYear());
            int[] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};
            this.setYear(diffYear(obj1, obj2));
            this.forceSetMonth(diffMonth(obj1, obj2));
            this.forceSetDate(diffDate(obj1, obj2));

            if(this.getMonth()<0){
                this.setYear(this.getYear()-1);
                this.forceSetMonth(12+this.getMonth());
            }
            if(this.getDate()<0){
                this.forceSetMonth(this.getMonth()-1);
                this.forceSetDate(daysInMonths[(this.getMonth())]+this.getDate());
            }
            if(leaps>0){
                this.forceSetDate(this.getDate()+leaps);
            }
        }
    }
}
