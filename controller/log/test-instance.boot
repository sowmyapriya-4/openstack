[    0.000000] Initializing cgroup subsys cpuset
[    0.000000] Initializing cgroup subsys cpu
[    0.000000] Initializing cgroup subsys cpuacct
[    0.000000] Linux version 4.4.0-28-generic (buildd@lcy01-13) (gcc version 5.3.1 20160413 (Ubuntu 5.3.1-14ubuntu2.1) ) #47-Ubuntu SMP Fri Jun 24 10:09:13 UTC 2016 (Ubuntu 4.4.0-28.47-generic 4.4.13)
[    0.000000] Command line: LABEL=cirros-rootfs ro console=tty1 console=ttyS0
[    0.000000] KERNEL supported cpus:
[    0.000000]   Intel GenuineIntel
[    0.000000]   AMD AuthenticAMD
[    0.000000]   Centaur CentaurHauls
[    0.000000] x86/fpu: xstate_offset[3]:  960, xstate_sizes[3]:   64
[    0.000000] x86/fpu: xstate_offset[4]: 1024, xstate_sizes[4]:   64
[    0.000000] x86/fpu: Supporting XSAVE feature 0x01: 'x87 floating point registers'
[    0.000000] x86/fpu: Supporting XSAVE feature 0x02: 'SSE registers'
[    0.000000] x86/fpu: Supporting XSAVE feature 0x08: 'MPX bounds registers'
[    0.000000] x86/fpu: Supporting XSAVE feature 0x10: 'MPX CSR'
[    0.000000] x86/fpu: Enabled xstate features 0x1b, context size is 1088 bytes, using 'standard' format.
[    0.000000] x86/fpu: Using 'eager' FPU context switches.
[    0.000000] e820: BIOS-provided physical RAM map:
[    0.000000] BIOS-e820: [mem 0x0000000000000000-0x000000000009fbff] usable
[    0.000000] BIOS-e820: [mem 0x000000000009fc00-0x000000000009ffff] reserved
[    0.000000] BIOS-e820: [mem 0x00000000000f0000-0x00000000000fffff] reserved
[    0.000000] BIOS-e820: [mem 0x0000000000100000-0x0000000003fdafff] usable
[    0.000000] BIOS-e820: [mem 0x0000000003fdb000-0x0000000003ffffff] reserved
[    0.000000] BIOS-e820: [mem 0x00000000fffc0000-0x00000000ffffffff] reserved
[    0.000000] NX (Execute Disable) protection: active
[    0.000000] SMBIOS 2.8 present.
[    0.000000] e820: last_pfn = 0x3fdb max_arch_pfn = 0x400000000
[    0.000000] x86/PAT: Configuration [0-7]: WB  WC  UC- UC  WB  WC  UC- WT  
[    0.000000] found SMP MP-table at [mem 0x000f5b40-0x000f5b4f] mapped at [ffff8800000f5b40]
[    0.000000] Scanning 1 areas for low memory corruption
[    0.000000] Using GB pages for direct mapping
[    0.000000] RAMDISK: [mem 0x03b15000-0x03fcafff]
[    0.000000] ACPI: Early table checksum verification disabled
[    0.000000] ACPI: RSDP 0x00000000000F5910 000014 (v00 BOCHS )
[    0.000000] ACPI: RSDT 0x0000000003FE17D3 000030 (v01 BOCHS  BXPC     00000001 BXPC 00000001)
[    0.000000] ACPI: FACP 0x0000000003FE16BF 000074 (v01 BOCHS  BXPC     00000001 BXPC 00000001)
[    0.000000] ACPI: DSDT 0x0000000003FE0040 00167F (v01 BOCHS  BXPC     00000001 BXPC 00000001)
[    0.000000] ACPI: FACS 0x0000000003FE0000 000040
[    0.000000] ACPI: APIC 0x0000000003FE1733 000078 (v01 BOCHS  BXPC     00000001 BXPC 00000001)
[    0.000000] ACPI: WAET 0x0000000003FE17AB 000028 (v01 BOCHS  BXPC     00000001 BXPC 00000001)
[    0.000000] No NUMA configuration found
[    0.000000] Faking a node at [mem 0x0000000000000000-0x0000000003fdafff]
[    0.000000] NODE_DATA(0) allocated [mem 0x03fd6000-0x03fdafff]
[    0.000000] Zone ranges:
[    0.000000]   DMA      [mem 0x0000000000001000-0x0000000000ffffff]
[    0.000000]   DMA32    [mem 0x0000000001000000-0x0000000003fdafff]
[    0.000000]   Normal   empty
[    0.000000]   Device   empty
[    0.000000] Movable zone start for each node
[    0.000000] Early memory node ranges
[    0.000000]   node   0: [mem 0x0000000000001000-0x000000000009efff]
[    0.000000]   node   0: [mem 0x0000000000100000-0x0000000003fdafff]
[    0.000000] Initmem setup node 0 [mem 0x0000000000001000-0x0000000003fdafff]
[    0.000000] ACPI: PM-Timer IO Port: 0x608
[    0.000000] ACPI: LAPIC_NMI (acpi_id[0xff] dfl dfl lint[0x1])
[    0.000000] IOAPIC[0]: apic_id 0, version 32, address 0xfec00000, GSI 0-23
[    0.000000] ACPI: INT_SRC_OVR (bus 0 bus_irq 0 global_irq 2 dfl dfl)
[    0.000000] ACPI: INT_SRC_OVR (bus 0 bus_irq 5 global_irq 5 high level)
[    0.000000] ACPI: INT_SRC_OVR (bus 0 bus_irq 9 global_irq 9 high level)
[    0.000000] ACPI: INT_SRC_OVR (bus 0 bus_irq 10 global_irq 10 high level)
[    0.000000] ACPI: INT_SRC_OVR (bus 0 bus_irq 11 global_irq 11 high level)
[    0.000000] Using ACPI (MADT) for SMP configuration information
[    0.000000] smpboot: Allowing 1 CPUs, 0 hotplug CPUs
[    0.000000] PM: Registered nosave memory: [mem 0x00000000-0x00000fff]
[    0.000000] PM: Registered nosave memory: [mem 0x0009f000-0x0009ffff]
[    0.000000] PM: Registered nosave memory: [mem 0x000a0000-0x000effff]
[    0.000000] PM: Registered nosave memory: [mem 0x000f0000-0x000fffff]
[    0.000000] e820: [mem 0x04000000-0xfffbffff] available for PCI devices
[    0.000000] Booting paravirtualized kernel on bare hardware
[    0.000000] clocksource: refined-jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 7645519600211568 ns
[    0.000000] setup_percpu: NR_CPUS:256 nr_cpumask_bits:256 nr_cpu_ids:1 nr_node_ids:1
[    0.000000] PERCPU: Embedded 33 pages/cpu @ffff880003800000 s98008 r8192 d28968 u2097152
[    0.000000] Built 1 zonelists in Node order, mobility grouping on.  Total pages: 15972
[    0.000000] Policy zone: DMA32
[    0.000000] Kernel command line: LABEL=cirros-rootfs ro console=tty1 console=ttyS0
[    0.000000] PID hash table entries: 256 (order: -1, 2048 bytes)
[    0.000000] Memory: 39216K/64996K available (8368K kernel code, 1280K rwdata, 3928K rodata, 1480K init, 1292K bss, 25780K reserved, 0K cma-reserved)
[    0.000000] SLUB: HWalign=64, Order=0-3, MinObjects=0, CPUs=1, Nodes=1
[    0.000000] Hierarchical RCU implementation.
[    0.000000] 	Build-time adjustment of leaf fanout to 64.
[    0.000000] 	RCU restricting CPUs from NR_CPUS=256 to nr_cpu_ids=1.
[    0.000000] RCU: Adjusting geometry for rcu_fanout_leaf=64, nr_cpu_ids=1
[    0.000000] NR_IRQS:16640 nr_irqs:256 16
[    0.000000] Console: colour VGA+ 80x25
[    0.000000] console [tty1] enabled
[    0.000000] console [ttyS0] enabled
[    0.000000] tsc: Fast TSC calibration using PIT
[    0.000000] tsc: Detected 2592.002 MHz processor
[    0.001052] Calibrating delay loop (skipped), value calculated using timer frequency.. 5184.00 BogoMIPS (lpj=10368008)
[    0.001438] pid_max: default: 32768 minimum: 301
[    0.001668] ACPI: Core revision 20150930
[    0.012000] ACPI: 1 ACPI AML tables successfully acquired and loaded
[    0.012000] Security Framework initialized
[    0.012000] Yama: becoming mindful.
[    0.012000] AppArmor: AppArmor initialized
[    0.012000] Dentry cache hash table entries: 8192 (order: 4, 65536 bytes)
[    0.012034] Inode-cache hash table entries: 4096 (order: 3, 32768 bytes)
[    0.012354] Mount-cache hash table entries: 512 (order: 0, 4096 bytes)
[    0.012492] Mountpoint-cache hash table entries: 512 (order: 0, 4096 bytes)
[    0.016000] Initializing cgroup subsys io
[    0.016000] Initializing cgroup subsys memory
[    0.016000] Initializing cgroup subsys devices
[    0.016000] Initializing cgroup subsys freezer
[    0.016000] Initializing cgroup subsys net_cls
[    0.016000] Initializing cgroup subsys perf_event
[    0.016000] Initializing cgroup subsys net_prio
[    0.016000] Initializing cgroup subsys hugetlb
[    0.016000] Initializing cgroup subsys pids
[    0.064000] mce: CPU supports 10 MCE banks
[    0.065706] Last level iTLB entries: 4KB 512, 2MB 255, 4MB 127
[    0.065921] Last level dTLB entries: 4KB 512, 2MB 255, 4MB 127, 1GB 0
[    0.153209] Freeing SMP alternatives memory: 28K (ffffffff820b4000 - ffffffff820bb000)
[    0.158993] ftrace: allocating 31920 entries in 125 pages
[    0.178425] smpboot: Max logical packages: 1
[    0.178923] smpboot: APIC(0) Converting physical 0 to logical package 0
[    0.180000] ..TIMER: vector=0x30 apic1=0 pin1=2 apic2=-1 pin2=-1
[    0.192000] ..MP-BIOS bug: 8254 timer not connected to IO-APIC
[    0.192000] ...trying to set up timer (IRQ0) through the 8259A ...
[    0.192000] ..... (found apic 0 pin 2) ...
[    0.200000] ....... failed.
[    0.200000] ...trying to set up timer as Virtual Wire IRQ...
[    0.236029] ..... works.
[    0.240000] APIC calibration not consistent with PM-Timer: 195ms instead of 100ms
[    0.240000] APIC delta adjusted to PM-Timer: 6249981 (12194163)
[    0.240000] smpboot: CPU0: AMD EPYC Processor (family: 0x17, model: 0x1, stepping: 0x2)
[    0.240000] Performance Events: Broken PMU hardware detected, using software events only.
[    0.240000] Failed to access perfctr msr (MSR c0010007 is 0)
[    0.244000] x86: Booted up 1 node, 1 CPUs
[    0.244000] smpboot: Total of 1 processors activated (5184.00 BogoMIPS)
[    0.248000] devtmpfs: initialized
[    0.252000] evm: security.selinux
[    0.252000] evm: security.SMACK64
[    0.252000] evm: security.SMACK64EXEC
[    0.252000] evm: security.SMACK64TRANSMUTE
[    0.252000] evm: security.SMACK64MMAP
[    0.252000] evm: security.ima
[    0.252000] evm: security.capability
[    0.252000] NMI watchdog: disabled (cpu0): hardware events not enabled
[    0.252000] NMI watchdog: Shutting down hard lockup detector on all cpus
[    0.253999] clocksource: jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 7645041785100000 ns
[    0.256000] pinctrl core: initialized pinctrl subsystem
[    0.256000] RTC time: 13:24:02, date: 03/10/22
[    0.260000] NET: Registered protocol family 16
[    0.261937] cpuidle: using governor ladder
[    0.262120] cpuidle: using governor menu
[    0.262229] PCCT header not found.
[    0.264000] ACPI: bus type PCI registered
[    0.264000] acpiphp: ACPI Hot Plug PCI Controller Driver version: 0.5
[    0.264000] PCI: Using configuration type 1 for base access
[    0.264000] PCI: Using configuration type 1 for extended access
[    0.272000] ACPI: Added _OSI(Module Device)
[    0.272000] ACPI: Added _OSI(Processor Device)
[    0.272000] ACPI: Added _OSI(3.0 _SCP Extensions)
[    0.272000] ACPI: Added _OSI(Processor Aggregator Device)
[    0.280000] ACPI: Interpreter enabled
[    0.280000] ACPI Exception: AE_NOT_FOUND, While evaluating Sleep State [\_S1_] (20150930/hwxface-580)
[    0.280000] ACPI Exception: AE_NOT_FOUND, While evaluating Sleep State [\_S2_] (20150930/hwxface-580)
[    0.280000] ACPI Exception: AE_NOT_FOUND, While evaluating Sleep State [\_S3_] (20150930/hwxface-580)
[    0.280000] ACPI Exception: AE_NOT_FOUND, While evaluating Sleep State [\_S4_] (20150930/hwxface-580)
[    0.280000] ACPI: (supports S0 S5)
[    0.280000] ACPI: Using IOAPIC for interrupt routing
[    0.280000] PCI: Using host bridge windows from ACPI; if necessary, use "pci=nocrs" and report a bug
[    0.288000] ACPI: PCI Root Bridge [PCI0] (domain 0000 [bus 00-ff])
[    0.288000] acpi PNP0A03:00: _OSC: OS supports [ExtendedConfig ASPM ClockPM Segments MSI]
[    0.288000] acpi PNP0A03:00: _OSC failed (AE_NOT_FOUND); disabling ASPM
[    0.289071] acpiphp: Slot [3] registered
[    0.289262] acpiphp: Slot [4] registered
[    0.289414] acpiphp: Slot [5] registered
[    0.289581] acpiphp: Slot [6] registered
[    0.289731] acpiphp: Slot [7] registered
[    0.289904] acpiphp: Slot [8] registered
[    0.290053] acpiphp: Slot [9] registered
[    0.290201] acpiphp: Slot [10] registered
[    0.290350] acpiphp: Slot [11] registered
[    0.290558] acpiphp: Slot [12] registered
[    0.291130] acpiphp: Slot [13] registered
[    0.291280] acpiphp: Slot [14] registered
[    0.291437] acpiphp: Slot [15] registered
[    0.291643] acpiphp: Slot [16] registered
[    0.291790] acpiphp: Slot [17] registered
[    0.291937] acpiphp: Slot [18] registered
[    0.292000] acpiphp: Slot [19] registered
[    0.292000] acpiphp: Slot [20] registered
[    0.292000] acpiphp: Slot [21] registered
[    0.292000] acpiphp: Slot [22] registered
[    0.292000] acpiphp: Slot [23] registered
[    0.292000] acpiphp: Slot [24] registered
[    0.292000] acpiphp: Slot [25] registered
[    0.292000] acpiphp: Slot [26] registered
[    0.292000] acpiphp: Slot [27] registered
[    0.292000] acpiphp: Slot [28] registered
[    0.292000] acpiphp: Slot [29] registered
[    0.292000] acpiphp: Slot [30] registered
[    0.292000] acpiphp: Slot [31] registered
[    0.292000] PCI host bridge to bus 0000:00
[    0.292000] pci_bus 0000:00: root bus resource [io  0x0000-0x0cf7 window]
[    0.292000] pci_bus 0000:00: root bus resource [io  0x0d00-0xffff window]
[    0.292000] pci_bus 0000:00: root bus resource [mem 0x000a0000-0x000bffff window]
[    0.292000] pci_bus 0000:00: root bus resource [mem 0x04000000-0xfebfffff window]
[    0.292000] pci_bus 0000:00: root bus resource [mem 0x100000000-0x17fffffff window]
[    0.292000] pci_bus 0000:00: root bus resource [bus 00-ff]
[    0.295828] pci 0000:00:01.1: legacy IDE quirk: reg 0x10: [io  0x01f0-0x01f7]
[    0.295970] pci 0000:00:01.1: legacy IDE quirk: reg 0x14: [io  0x03f6]
[    0.296000] pci 0000:00:01.1: legacy IDE quirk: reg 0x18: [io  0x0170-0x0177]
[    0.296000] pci 0000:00:01.1: legacy IDE quirk: reg 0x1c: [io  0x0376]
[    0.296000] pci 0000:00:01.3: quirk: [io  0x0600-0x063f] claimed by PIIX4 ACPI
[    0.296000] pci 0000:00:01.3: quirk: [io  0x0700-0x070f] claimed by PIIX4 SMB
[    0.299141] ACPI: PCI Interrupt Link [LNKA] (IRQs 5 *10 11)
[    0.299893] ACPI: PCI Interrupt Link [LNKB] (IRQs 5 *10 11)
[    0.300000] ACPI: PCI Interrupt Link [LNKC] (IRQs 5 10 *11)
[    0.300000] ACPI: PCI Interrupt Link [LNKD] (IRQs 5 10 *11)
[    0.300000] ACPI: PCI Interrupt Link [LNKS] (IRQs *9)
[    0.300000] ACPI: Enabled 2 GPEs in block 00 to 0F
[    0.300000] vgaarb: setting as boot device: PCI:0000:00:02.0
[    0.300000] vgaarb: device added: PCI:0000:00:02.0,decodes=io+mem,owns=io+mem,locks=none
[    0.300057] vgaarb: loaded
[    0.300169] vgaarb: bridge control possible 0000:00:02.0
[    0.303506] SCSI subsystem initialized
[    0.304000] ACPI: bus type USB registered
[    0.304000] usbcore: registered new interface driver usbfs
[    0.304000] usbcore: registered new interface driver hub
[    0.304000] usbcore: registered new device driver usb
[    0.304000] PCI: Using ACPI for IRQ routing
[    0.308000] NetLabel: Initializing
[    0.308000] NetLabel:  domain hash size = 128
[    0.308000] NetLabel:  protocols = UNLABELED CIPSOv4
[    0.308000] NetLabel:  unlabeled traffic allowed by default
[    0.308000] clocksource: Switched to clocksource refined-jiffies
[    0.328001] AppArmor: AppArmor Filesystem Enabled
[    0.328001] pnp: PnP ACPI init
[    0.328962] pnp: PnP ACPI: found 5 devices
[    0.337111] clocksource: acpi_pm: mask: 0xffffff max_cycles: 0xffffff, max_idle_ns: 2085701024 ns
[    0.337319] clocksource: Switched to clocksource acpi_pm
[    0.338490] NET: Registered protocol family 2
[    0.340002] TCP established hash table entries: 512 (order: 0, 4096 bytes)
[    0.340002] TCP bind hash table entries: 512 (order: 1, 8192 bytes)
[    0.340002] TCP: Hash tables configured (established 512 bind 512)
[    0.340002] UDP hash table entries: 256 (order: 1, 8192 bytes)
[    0.340002] UDP-Lite hash table entries: 256 (order: 1, 8192 bytes)
[    0.340002] NET: Registered protocol family 1
[    0.340002] pci 0000:00:00.0: Limiting direct PCI/PCI transfers
[    0.340002] pci 0000:00:01.0: PIIX3: Enabling Passive Release
[    0.340002] pci 0000:00:01.0: Activating ISA DMA hang workarounds
[    0.497029] ACPI: PCI Interrupt Link [LNKD] enabled at IRQ 11
[    0.639470] Trying to unpack rootfs image as initramfs...
[    0.923100] Freeing initrd memory: 4824K (ffff880003b15000 - ffff880003fcb000)
[    0.923100] Scanning for low memory corruption every 60 seconds
[    0.933891] futex hash table entries: 256 (order: 2, 16384 bytes)
[    0.933891] audit: initializing netlink subsys (disabled)
[    0.933891] audit: type=2000 audit(1646918641.927:1): initialized
[    0.933891] Initialise system trusted keyring
[    0.943550] HugeTLB registered 1 GB page size, pre-allocated 0 pages
[    0.943689] HugeTLB registered 2 MB page size, pre-allocated 0 pages
[    0.963894] zbud: loaded
[    0.965944] VFS: Disk quotas dquot_6.6.0
[    0.966041] VFS: Dquot-cache hash table entries: 512 (order 0, 4096 bytes)
[    0.974654] fuse init (API version 7.23)
[    0.976615] Key type big_key registered
[    0.976864] Allocating IMA MOK and blacklist keyrings.
[    0.976864] Key type asymmetric registered
[    0.976864] Asymmetric key parser 'x509' registered
[    0.976864] Block layer SCSI generic (bsg) driver version 0.4 loaded (major 249)
[    0.976864] io scheduler noop registered
[    0.976864] io scheduler deadline registered (default)
[    0.976864] io scheduler cfq registered
[    0.984595] pci_hotplug: PCI Hot Plug PCI Core version: 0.5
[    0.984767] pciehp: PCI Express Hot Plug Controller Driver version: 0.4
[    0.986803] input: Power Button as /devices/LNXSYSTM:00/LNXPWRBN:00/input/input0
[    0.987399] ACPI: Power Button [PWRF]
[    0.987636] GHES: HEST is not enabled!
[    1.138835] ACPI: PCI Interrupt Link [LNKC] enabled at IRQ 10
[    1.447749] ACPI: PCI Interrupt Link [LNKA] enabled at IRQ 10
[    1.608237] ACPI: PCI Interrupt Link [LNKB] enabled at IRQ 11
[    1.618600] Serial: 8250/16550 driver, 32 ports, IRQ sharing enabled
[    1.640908] 00:00: ttyS0 at I/O 0x3f8 (irq = 4, base_baud = 115200) is a 16550A
[    1.651808] Linux agpgart interface v0.103
[    1.721499] brd: module loaded
[    1.732354] loop: module loaded
[    1.756754] GPT:Primary header thinks Alt. header is not at the end of the disk.
[    1.756914] GPT:90111 != 2097151
[    1.756978] GPT:Alternate GPT header not at the end of the disk.
[    1.757065] GPT:90111 != 2097151
[    1.757145] GPT: Use GNU Parted to correct GPT errors.
[    1.757836]  vda: vda1 vda15
[    1.769008] scsi host0: ata_piix
[    1.770271] scsi host1: ata_piix
[    1.770854] ata1: PATA max MWDMA2 cmd 0x1f0 ctl 0x3f6 bmdma 0xc0e0 irq 14
[    1.771082] ata2: PATA max MWDMA2 cmd 0x170 ctl 0x376 bmdma 0xc0e8 irq 15
[    1.771478] libphy: Fixed MDIO Bus: probed
[    1.771478] tun: Universal TUN/TAP device driver, 1.6
[    1.771478] tun: (C) 1999-2004 Max Krasnyansky <maxk@qualcomm.com>
[    1.782915] PPP generic driver version 2.4.2
[    1.783496] ehci_hcd: USB 2.0 'Enhanced' Host Controller (EHCI) Driver
[    1.783496] ehci-pci: EHCI PCI platform driver
[    1.783496] ehci-platform: EHCI generic platform driver
[    1.783496] ohci_hcd: USB 1.1 'Open' Host Controller (OHCI) Driver
[    1.783496] ohci-pci: OHCI PCI platform driver
[    1.783496] ohci-platform: OHCI generic platform driver
[    1.783496] uhci_hcd: USB Universal Host Controller Interface driver
[    1.920493] tsc: Refined TSC clocksource calibration: 2591.997 MHz
[    1.920645] clocksource: tsc: mask: 0xffffffffffffffff max_cycles: 0x255cb41266b, max_idle_ns: 440795324830 ns
[    1.935184] uhci_hcd 0000:00:01.2: UHCI Host Controller
[    1.935184] uhci_hcd 0000:00:01.2: new USB bus registered, assigned bus number 1
[    1.935184] uhci_hcd 0000:00:01.2: detected 2 ports
[    1.935184] uhci_hcd 0000:00:01.2: irq 11, io base 0x0000c080
[    1.945125] usb usb1: New USB device found, idVendor=1d6b, idProduct=0001
[    1.945237] usb usb1: New USB device strings: Mfr=3, Product=2, SerialNumber=1
[    1.945355] usb usb1: Product: UHCI Host Controller
[    1.945438] usb usb1: Manufacturer: Linux 4.4.0-28-generic uhci_hcd
[    1.945532] usb usb1: SerialNumber: 0000:00:01.2
[    1.945889] hub 1-0:1.0: USB hub found
[    1.945889] hub 1-0:1.0: 2 ports detected
[    1.953559] i8042: PNP: PS/2 Controller [PNP0303:KBD,PNP0f13:MOU] at 0x60,0x64 irq 1,12
[    1.955749] serio: i8042 KBD port at 0x60,0x64 irq 1
[    1.955961] serio: i8042 AUX port at 0x60,0x64 irq 12
[    1.956703] mousedev: PS/2 mouse device common for all mice
[    1.956703] input: AT Translated Set 2 keyboard as /devices/platform/i8042/serio0/input/input1
[    1.956703] rtc_cmos 00:04: RTC can wake from S4
[    1.964478] rtc_cmos 00:04: rtc core: registered rtc_cmos as rtc0
[    1.964872] rtc_cmos 00:04: alarms up to one day, y3k, 242 bytes nvram
[    1.965076] i2c /dev entries driver
[    1.965895] device-mapper: uevent: version 1.0.3
[    1.966814] device-mapper: ioctl: 4.34.0-ioctl (2015-10-28) initialised: dm-devel@redhat.com
[    1.967344] ledtrig-cpu: registered to indicate activity on CPUs
[    1.967494] NET: Registered protocol family 10
[    1.976096] NET: Registered protocol family 17
[    1.976491] Key type dns_resolver registered
[    1.978155] microcode: CPU0: patch_level=0x01000065
[    1.978155] microcode: Microcode Update Driver: v2.01 <tigran@aivazian.fsnet.co.uk>, Peter Oruba
[    1.978155] registered taskstats version 1
[    1.978155] Loading compiled-in X.509 certificates
[    1.988737] Loaded X.509 cert 'Build time autogenerated kernel key: 6ea974e07bd0b30541f4d838a3b7a8a80d5ca9af'
[    1.988871] zswap: loaded using pool lzo/zbud
[    2.050083] Key type trusted registered
[    2.095436] Key type encrypted registered
[    2.095436] AppArmor: AppArmor sha1 policy hashing enabled
[    2.095436] ima: No TPM chip found, activating TPM-bypass!
[    2.095436] evm: HMAC attrs: 0x1
[    2.106163]   Magic number: 14:484:432
[    2.106163] rtc_cmos 00:04: setting system clock to 2022-03-10 13:24:04 UTC (1646918644)
[    2.106163] BIOS EDD facility v0.16 2004-Jun-25, 0 devices found
[    2.106163] EDD information not available.
[    2.159707] Freeing unused kernel memory: 1480K (ffffffff81f42000 - ffffffff820b4000)
[    2.159707] Write protecting the kernel read-only data: 14336k
[    2.159707] Freeing unused kernel memory: 1860K (ffff88000182f000 - ffff880001a00000)
[    2.166917] Freeing unused kernel memory: 168K (ffff880001dd6000 - ffff880001e00000)

info: initramfs: up at 2.23
modprobe: module virtio_pci not found in modules.dep
modprobe: module virtio_blk not found in modules.dep
modprobe: module virtio_net not found in modules.dep
modprobe: module vfat not found in modules.dep
modprobe: module nls_cp437 not found in modules.dep
info: copying initramfs to /dev/vda1
info: initramfs loading root from /dev/vda1
info: /etc/init.d/rc.sysinit: up at 4.35
info: container: none
Starting logging: OK
modprobe: module virtio_pci not found in modules.dep
modprobe: module virtio_blk not found in modules.dep
modprobe: module virtio_net not found in modules.dep
modprobe: module vfat not found in modules.dep
modprobe: module nls_cp437 not found in modules.dep
WARN: /etc/rc3.d/S10-load-modules failed
Initializing random number generator... [    4.994001] random: dd urandom read with 8 bits of entropy available
done.
Starting acpid: OK
Starting network...
udhcpc (v1.23.2) started
Sending discover...
Sending discover...
Sending discover...
Usage: /sbin/cirros-dhcpc <up|down>
No lease, failing
WARN: /etc/rc3.d/S40-network failed
checking http://169.254.169.254/2009-04-04/instance-id
failed 1/20: up 186.85. request failed
failed 2/20: up 188.98. request failed
