package cn.chuanwise.command.event;

/**
 * 可以被取消的事件
 *
 * @author Chuanwise
 */
public interface Cancellable {
    
    /**
     * 询问事件是否被取消
     *
     * @return 事件是否被取消
     */
    boolean isCancelled();
    
    /**
     * 设置事件是否被取消
     *
     * @param cancelled 事件是否被取消
     */
    void setCancelled(boolean cancelled);
}
