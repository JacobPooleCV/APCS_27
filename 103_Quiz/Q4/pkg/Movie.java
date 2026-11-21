package pkg;

    public class Movie{

        
        private String MovieName;
        private double rating;
        private int numRatings;
        private int Revenue;
        

        public Movie(){
            MovieName = "Avengers";
            rating = 8.0;
            numRatings = 33;
            Revenue = 623357910;
        }

        public Movie(String a, double b, int c, int d){
            MovieName = a;
            rating = b;
            numRatings = c;
            Revenue = d;
        }

        public void movieToString(){
            System.out.println("Movie: " + MovieName);
            System.out.println("Rating: " + rating);
            System.out.println("Number of Ratings: " + numRatings);
            System.out.println("Revenue: " + Revenue);
            System.out.println();
        }

        public String getMovieName(){
            return MovieName;
        }

        public int getRevenue(){
            return Revenue;
        }

        public void addRating(double r){
            rating = ((rating*numRatings)+r)/(numRatings+1);
        }

        public double getRating(){
            return rating;
        }

        public boolean compareRatings(Movie B){
            if (rating > B.getRating()){
                return true;
            }
            else {
                return false;
            }
        }

        /*
        public String revenueToString(){
            String revenueToSTring 
        }

        DID NOT FINISH 6-7


        public Movie pirateMovie(){
            Movie 
        }
        */



        




    }