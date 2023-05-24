public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        ICommand on = new LightOnCommand(light);
        ICommand off = new LightOffCommand(light);

        RemoteController telecommande = new RemoteController();
        telecommande.addCommand("on", on);
        telecommande.addCommand("off", off);

        System.out.println(light.toString());

        light.on();
        System.out.println(light.toString());

        off.execute();
        System.out.println(light.toString());

        telecommande.execute("on");
        System.out.println(light.toString());

        telecommande.execute("off");
        System.out.println(light.toString());

    }
}