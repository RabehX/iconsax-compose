/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.BluetoothCircle: ImageVector
    get() {
        if (_BluetoothCircle != null) {
            return _BluetoothCircle!!
        }
        _BluetoothCircle = ImageVector.Builder(
            name = "Filled.BluetoothCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.9f, 10.592f)
                lineTo(14.57f, 9.062f)
                lineTo(12.9f, 7.672f)
                verticalLineTo(10.592f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.9f, 16.33f)
                lineTo(14.57f, 14.94f)
                lineTo(12.9f, 13.41f)
                verticalLineTo(16.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(15.72f, 13.95f)
                curveTo(16.01f, 14.22f, 16.17f, 14.59f, 16.16f, 14.97f)
                curveTo(16.15f, 15.35f, 15.97f, 15.72f, 15.67f, 15.97f)
                lineTo(13.6f, 17.7f)
                curveTo(13.22f, 18.02f, 12.87f, 18.11f, 12.6f, 18.11f)
                curveTo(12.38f, 18.11f, 12.21f, 18.05f, 12.11f, 18.01f)
                curveTo(11.89f, 17.91f, 11.39f, 17.58f, 11.39f, 16.67f)
                verticalLineTo(14f)
                lineTo(9.09f, 16.11f)
                curveTo(8.79f, 16.39f, 8.31f, 16.37f, 8.03f, 16.06f)
                curveTo(7.75f, 15.75f, 7.77f, 15.28f, 8.08f, 15f)
                lineTo(11.36f, 12f)
                lineTo(8.08f, 8.99f)
                curveTo(7.78f, 8.71f, 7.76f, 8.24f, 8.04f, 7.93f)
                curveTo(8.32f, 7.63f, 8.8f, 7.6f, 9.1f, 7.88f)
                lineTo(11.4f, 10f)
                verticalLineTo(7.33f)
                curveTo(11.4f, 6.43f, 11.9f, 6.1f, 12.12f, 5.99f)
                curveTo(12.33f, 5.89f, 12.91f, 5.72f, 13.61f, 6.29f)
                lineTo(15.67f, 8.01f)
                curveTo(15.97f, 8.26f, 16.15f, 8.63f, 16.16f, 9.01f)
                curveTo(16.17f, 9.39f, 16.01f, 9.77f, 15.72f, 10.03f)
                lineTo(13.58f, 12f)
                lineTo(15.72f, 13.95f)
                close()
            }
        }.build()

        return _BluetoothCircle!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothCircle: ImageVector? = null
