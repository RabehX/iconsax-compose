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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.BluetoothRectangle: ImageVector
    get() {
        if (_BluetoothRectangle != null) {
            return _BluetoothRectangle!!
        }
        _BluetoothRectangle = ImageVector.Builder(
            name = "Outline.BluetoothRectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.6f, 18.11f)
                curveTo(12.38f, 18.11f, 12.21f, 18.05f, 12.11f, 18.01f)
                curveTo(11.89f, 17.91f, 11.39f, 17.58f, 11.39f, 16.67f)
                verticalLineTo(14f)
                lineTo(9.09f, 16.11f)
                curveTo(8.79f, 16.39f, 8.31f, 16.37f, 8.03f, 16.06f)
                curveTo(7.75f, 15.75f, 7.77f, 15.28f, 8.08f, 15f)
                lineTo(11.36f, 11.99f)
                lineTo(8.08f, 8.98f)
                curveTo(7.77f, 8.7f, 7.75f, 8.23f, 8.03f, 7.92f)
                curveTo(8.31f, 7.62f, 8.79f, 7.59f, 9.09f, 7.87f)
                lineTo(11.39f, 9.98f)
                verticalLineTo(7.32f)
                curveTo(11.39f, 6.42f, 11.89f, 6.09f, 12.11f, 5.98f)
                curveTo(12.32f, 5.88f, 12.9f, 5.71f, 13.6f, 6.28f)
                lineTo(15.66f, 8f)
                curveTo(15.96f, 8.25f, 16.14f, 8.62f, 16.15f, 9f)
                curveTo(16.16f, 9.38f, 16f, 9.76f, 15.71f, 10.02f)
                lineTo(13.58f, 11.97f)
                lineTo(15.71f, 13.92f)
                curveTo(16f, 14.19f, 16.16f, 14.56f, 16.15f, 14.94f)
                curveTo(16.14f, 15.32f, 15.96f, 15.69f, 15.66f, 15.94f)
                lineTo(13.6f, 17.66f)
                curveTo(13.22f, 18.02f, 12.87f, 18.11f, 12.6f, 18.11f)
                close()
                moveTo(12.9f, 13.41f)
                verticalLineTo(16.33f)
                lineTo(14.57f, 14.94f)
                lineTo(12.9f, 13.41f)
                close()
                moveTo(12.9f, 7.67f)
                verticalLineTo(10.59f)
                lineTo(14.57f, 9.06f)
                lineTo(12.9f, 7.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(5.56f, 22.75f, 3.25f, 20.44f, 3.25f, 17f)
                verticalLineTo(7f)
                curveTo(3.25f, 3.56f, 5.56f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(18.44f, 1.25f, 20.75f, 3.56f, 20.75f, 7f)
                verticalLineTo(17f)
                curveTo(20.75f, 20.44f, 18.44f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(6.42f, 2.75f, 4.75f, 4.42f, 4.75f, 7f)
                verticalLineTo(17f)
                curveTo(4.75f, 19.58f, 6.42f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(17.58f, 21.25f, 19.25f, 19.58f, 19.25f, 17f)
                verticalLineTo(7f)
                curveTo(19.25f, 4.42f, 17.58f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _BluetoothRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothRectangle: ImageVector? = null
