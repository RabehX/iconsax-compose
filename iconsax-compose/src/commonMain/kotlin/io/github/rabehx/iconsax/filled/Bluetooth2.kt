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


val Iconsax.Filled.Bluetooth2: ImageVector
    get() {
        if (_Bluetooth2 != null) {
            return _Bluetooth2!!
        }
        _Bluetooth2 = ImageVector.Builder(
            name = "Filled.Bluetooth2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.301f, 17.321f)
                lineTo(14.611f, 15.391f)
                lineTo(12.301f, 13.301f)
                verticalLineTo(17.321f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.301f, 6.68f)
                verticalLineTo(10.64f)
                lineTo(14.611f, 8.52f)
                lineTo(12.301f, 6.68f)
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
                moveTo(5.25f, 12f)
                curveTo(5.25f, 11.24f, 5.87f, 10.62f, 6.63f, 10.62f)
                curveTo(7.39f, 10.62f, 8f, 11.24f, 8f, 12f)
                curveTo(8f, 12.76f, 7.38f, 13.38f, 6.62f, 13.38f)
                curveTo(5.86f, 13.38f, 5.25f, 12.76f, 5.25f, 12f)
                close()
                moveTo(15.57f, 16.54f)
                lineTo(13.16f, 18.55f)
                curveTo(12.75f, 18.9f, 12.37f, 19f, 12.08f, 19f)
                curveTo(11.85f, 19f, 11.67f, 18.94f, 11.57f, 18.89f)
                curveTo(11.34f, 18.78f, 10.8f, 18.43f, 10.8f, 17.45f)
                verticalLineTo(14.06f)
                lineTo(7.9f, 16.71f)
                curveTo(7.6f, 16.99f, 7.12f, 16.97f, 6.84f, 16.66f)
                curveTo(6.56f, 16.35f, 6.58f, 15.88f, 6.89f, 15.6f)
                lineTo(10.8f, 12.02f)
                verticalLineTo(11.94f)
                lineTo(6.89f, 8.4f)
                curveTo(6.58f, 8.12f, 6.56f, 7.65f, 6.84f, 7.34f)
                curveTo(7.12f, 7.04f, 7.6f, 7.01f, 7.9f, 7.29f)
                lineTo(10.8f, 9.94f)
                verticalLineTo(6.56f)
                curveTo(10.8f, 5.58f, 11.34f, 5.22f, 11.57f, 5.12f)
                curveTo(11.8f, 5.01f, 12.42f, 4.83f, 13.17f, 5.46f)
                lineTo(15.58f, 7.47f)
                curveTo(15.91f, 7.74f, 16.1f, 8.13f, 16.11f, 8.54f)
                curveTo(16.12f, 8.95f, 15.95f, 9.35f, 15.64f, 9.64f)
                lineTo(13.04f, 12f)
                lineTo(15.63f, 14.37f)
                curveTo(15.94f, 14.66f, 16.12f, 15.06f, 16.11f, 15.47f)
                curveTo(16.09f, 15.88f, 15.9f, 16.27f, 15.57f, 16.54f)
                close()
                moveTo(17.38f, 13.38f)
                curveTo(16.62f, 13.38f, 16f, 12.76f, 16f, 12f)
                curveTo(16f, 11.24f, 16.62f, 10.62f, 17.38f, 10.62f)
                curveTo(18.14f, 10.62f, 18.76f, 11.24f, 18.76f, 12f)
                curveTo(18.76f, 12.76f, 18.13f, 13.38f, 17.38f, 13.38f)
                close()
            }
        }.build()

        return _Bluetooth2!!
    }

@Suppress("ObjectPropertyName")
private var _Bluetooth2: ImageVector? = null
