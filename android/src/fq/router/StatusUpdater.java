package fq.router;

public interface StatusUpdater {
    void updateStatus(String status);
    void appendLog(String log);
}