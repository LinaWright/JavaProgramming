package day31_array;

public class HWAWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        String [] eachZone = zones.split(",");
        for (int i = 0; i < eachZone.length; i++) {
            System.out.println("Deploying " + app + " to " + eachZone[i]);
            System.out.println("Deployment completed for " + eachZone[i]);
        }
    }
}
/*

public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        String [] allZones = zones.split(",");

        for(String eachZone : allZones){
            System.out.println(app + " is deploying on " + eachZone);
        }

//        for(int i = 0; i < allZones.length; i++){
//            System.out.println(app + " is deploying on " + allZones[i]);
//        }

    }

AWS Zones

Given an app name and a String of zones in the following format

	us-east-1,us-west-1,us-west-2,us-west-3

	print the app deploying to each zone

Ex:
	app = etsy
    zones = us-east-1,us-west-2,us-west-1

    output:
		Deploying etsy to us-east-1...
		Deployment completed for us-east-1

		Deploying etsy to us-west-1...
		Deployment completed for us-west-1

		Deploying etsy to us-west-2...
		Deployment completed for us-west-2
 */