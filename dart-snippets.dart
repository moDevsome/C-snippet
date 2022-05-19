// Create timeout
final timout = Timer(const Duration(seconds: 1), () {

  // The callback to execute when the time is out

});

// Create timer
void startTimer() {

  Timer.periodic(Duration(seconds: 1), (_) {
    // The timer callback
  });

}
