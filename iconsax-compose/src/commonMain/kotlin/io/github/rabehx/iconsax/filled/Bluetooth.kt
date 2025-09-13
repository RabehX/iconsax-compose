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


val Iconsax.Filled.Bluetooth: ImageVector
    get() {
        if (_Bluetooth != null) {
            return _Bluetooth!!
        }
        _Bluetooth = ImageVector.Builder(
            name = "Filled.Bluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.93f, 10.641f)
                lineTo(15.26f, 8.511f)
                lineTo(12.93f, 6.641f)
                verticalLineTo(10.641f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(16.27f, 14.39f)
                curveTo(16.58f, 14.68f, 16.76f, 15.08f, 16.75f, 15.49f)
                curveTo(16.74f, 15.9f, 16.55f, 16.29f, 16.22f, 16.57f)
                lineTo(13.8f, 18.59f)
                curveTo(13.38f, 18.94f, 13f, 19.04f, 12.71f, 19.04f)
                curveTo(12.48f, 19.04f, 12.3f, 18.98f, 12.2f, 18.93f)
                curveTo(11.97f, 18.82f, 11.43f, 18.46f, 11.43f, 17.48f)
                verticalLineTo(14.06f)
                lineTo(8.51f, 16.74f)
                curveTo(8.21f, 17.02f, 7.73f, 17f, 7.45f, 16.69f)
                curveTo(7.17f, 16.38f, 7.19f, 15.91f, 7.5f, 15.63f)
                lineTo(11.43f, 12.03f)
                verticalLineTo(11.95f)
                lineTo(7.49f, 8.38f)
                curveTo(7.19f, 8.1f, 7.17f, 7.62f, 7.45f, 7.32f)
                curveTo(7.73f, 7.02f, 8.21f, 6.99f, 8.51f, 7.27f)
                lineTo(11.43f, 9.95f)
                verticalLineTo(6.53f)
                curveTo(11.43f, 5.55f, 11.97f, 5.19f, 12.2f, 5.08f)
                curveTo(12.43f, 4.97f, 13.05f, 4.79f, 13.8f, 5.42f)
                lineTo(16.22f, 7.44f)
                curveTo(16.55f, 7.71f, 16.74f, 8.11f, 16.75f, 8.52f)
                curveTo(16.76f, 8.93f, 16.59f, 9.33f, 16.27f, 9.62f)
                lineTo(13.67f, 12f)
                lineTo(16.27f, 14.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.93f, 17.361f)
                lineTo(15.26f, 15.411f)
                lineTo(12.93f, 13.301f)
                verticalLineTo(17.361f)
                close()
            }
        }.build()

        return _Bluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _Bluetooth: ImageVector? = null
