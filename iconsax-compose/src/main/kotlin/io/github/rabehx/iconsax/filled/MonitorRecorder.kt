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


val Iconsax.Filled.MonitorRecorder: ImageVector
    get() {
        if (_MonitorRecorder != null) {
            return _MonitorRecorder!!
        }
        _MonitorRecorder = ImageVector.Builder(
            name = "Filled.MonitorRecorder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.97f, 10.37f)
                verticalLineTo(13.56f)
                curveTo(20.97f, 15.88f, 19.09f, 17.76f, 16.77f, 17.76f)
                horizontalLineTo(13.21f)
                curveTo(12.66f, 17.76f, 12.21f, 18.2f, 12.21f, 18.76f)
                verticalLineTo(19.58f)
                curveTo(12.21f, 20.13f, 12.66f, 20.58f, 13.21f, 20.58f)
                horizontalLineTo(15.47f)
                curveTo(15.86f, 20.58f, 16.18f, 20.89f, 16.18f, 21.29f)
                curveTo(16.18f, 21.68f, 15.86f, 22f, 15.47f, 22f)
                horizontalLineTo(7.53f)
                curveTo(7.14f, 22f, 6.82f, 21.68f, 6.82f, 21.29f)
                curveTo(6.82f, 20.89f, 7.14f, 20.58f, 7.53f, 20.58f)
                horizontalLineTo(9.79f)
                curveTo(10.34f, 20.58f, 10.79f, 20.13f, 10.79f, 19.58f)
                verticalLineTo(18.76f)
                curveTo(10.79f, 18.2f, 10.34f, 17.76f, 9.79f, 17.76f)
                horizontalLineTo(6.19f)
                curveTo(3.88f, 17.76f, 2f, 15.88f, 2f, 13.56f)
                verticalLineTo(7.19f)
                curveTo(2f, 4.88f, 3.88f, 3f, 6.19f, 3f)
                horizontalLineTo(10.5f)
                curveTo(11.05f, 3f, 11.5f, 3.45f, 11.5f, 4f)
                verticalLineTo(6.15f)
                curveTo(11.5f, 8.08f, 12.79f, 9.37f, 14.71f, 9.37f)
                horizontalLineTo(19.97f)
                curveTo(20.52f, 9.37f, 20.97f, 9.82f, 20.97f, 10.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.99f, 2.36f)
                lineTo(20.86f, 3.15f)
                verticalLineTo(2.73f)
                curveTo(20.86f, 1.78f, 20.09f, 1.02f, 19.15f, 1.02f)
                horizontalLineTo(14.87f)
                curveTo(13.84f, 1.01f, 13f, 1.85f, 13f, 2.88f)
                verticalLineTo(6.16f)
                curveTo(13f, 7.02f, 13.43f, 7.87f, 14.71f, 7.87f)
                horizontalLineTo(19.14f)
                curveTo(20.09f, 7.87f, 20.85f, 7.1f, 20.85f, 6.16f)
                verticalLineTo(5.73f)
                lineTo(21.98f, 6.52f)
                curveTo(22.55f, 6.91f, 23f, 6.67f, 23f, 5.99f)
                verticalLineTo(2.89f)
                curveTo(23f, 2.21f, 22.55f, 1.98f, 21.99f, 2.36f)
                close()
            }
        }.build()

        return _MonitorRecorder!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorRecorder: ImageVector? = null
