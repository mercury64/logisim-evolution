/*
 * Logisim-evolution - digital logic design tool and simulator
 * Copyright by the Logisim-evolution developers
 *
 * https://github.com/logisim-evolution/
 *
 * This is free software released under GNU GPLv3 license
 */

package com.cburch.logisim.util;

public class QNode {
  final long key;
  QNode left, right;

  public QNode(long key) {
    this.key = key;
  }
}
