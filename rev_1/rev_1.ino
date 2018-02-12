int trigPin = 4;
int echoPin = 0;
int distance;
int relay = 5;


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  pinMode(relay, OUTPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  distance = analogRead(echoPin);
  if(distance<=5){
    digitalWrite(relay, LOW);
  }
  if(distance>=10){
    digitalWrite(relay, HIGH);
  }
  delay(5000);
}
