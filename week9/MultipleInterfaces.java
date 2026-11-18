// A class can implement multiple interfaces: Java's way of achieving
// "multiple inheritance" of type.

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface Phone {
    void makeCall(String number);
}

// A class implementing THREE interfaces
class Smartphone implements Camera, MusicPlayer, Phone {
    private String model;

    public Smartphone(String model) {
        this.model = model;
    }

    @Override
    public void takePhoto() {
        System.out.println(model + " is taking a photo... Click!");
    }

    @Override
    public void playMusic() {
        System.out.println(model + " is playing music... ");
    }

    @Override
    public void makeCall(String number) {
        System.out.println(model + " is calling " + number + "... ");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung Galaxy");

        // The object can call all of its methods.
        myPhone.takePhoto();
        myPhone.playMusic();
        myPhone.makeCall("0712345678");

        System.out.println("\n=== POLYMORPHISM WITH INTERFACES ===");

        // Treat the Smartphone as any of its interface types.
        Camera cam = myPhone;          // A Smartphone IS-A Camera
        MusicPlayer mp = myPhone;      // A Smartphone IS-A MusicPlayer

        // cam can only access camera methods.
        cam.takePhoto();
        // cam.playMusic();   // ERROR! The Camera interface doesn't know about playMusic().

        // mp can only access music methods.
        mp.playMusic();
    }
}
