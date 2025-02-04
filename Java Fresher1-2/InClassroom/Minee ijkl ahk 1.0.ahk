; Ensure Caps Lock is always off
SetCapsLockState, AlwaysOff

; When Caps Lock is active, rebind keys
#If GetKeyState("CapsLock", "P")
i::Up
j::Left
k::Down
l::Right
u::Home
o::End 
#If

; Caps Lock key handling
*CapsLock::
KeyWait, CapsLock
Return
