public class Machinery {

    public String type;
    public String model;
    public int weight;
    public String fuelType;
    public byte[] coordinations;
    public float maxSpeed;

    public void fullValue(String _type, String _model, int _weight, String _fuelType, byte[] _coordinations, float _maxSpeed) {
        type = _type;
        model = _model;
        weight = _weight;
        fuelType = _fuelType;
        coordinations = _coordinations;
        maxSpeed = _maxSpeed;

    }

    //Створення методу для конструювання шаблону друку даних
    public String PrintValue() {
String info = "тип техніки - " + type + "; " + "модель техіки - " + model + "; " + "вага = " + weight + "; " + "тип палива - " + fuelType + "; " + "місце розташування на базі -" + coordinations + ";";


    String printCoordinations = "Coordinations:\n";
    for (byte cor : coordinations)
        printCoordinations += cor + "\n";

        return info + printCoordinations;

    }


}
