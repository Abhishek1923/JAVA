public class TestLifeOne {
public void read() {
int s = 42;
sleep();
}
public void sleep() {
s = 7;//it shows error because sleep() knows nothing about read();
}
}