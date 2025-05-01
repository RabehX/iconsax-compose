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


val Iconsax.Filled.MessageProgramming: ImageVector
    get() {
        if (_MessageProgramming != null) {
            return _MessageProgramming!!
        }
        _MessageProgramming = ImageVector.Builder(
            name = "Filled.MessageProgramming",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 1.969f)
                horizontalLineTo(8f)
                curveTo(4f, 1.969f, 2f, 3.969f, 2f, 7.969f)
                verticalLineTo(12.969f)
                curveTo(2f, 17.969f, 4f, 18.969f, 8f, 18.969f)
                horizontalLineTo(8.5f)
                curveTo(8.78f, 18.969f, 9.14f, 19.149f, 9.3f, 19.369f)
                lineTo(10.8f, 21.369f)
                curveTo(11.46f, 22.249f, 12.54f, 22.249f, 13.2f, 21.369f)
                lineTo(14.7f, 19.369f)
                curveTo(14.89f, 19.119f, 15.19f, 18.969f, 15.5f, 18.969f)
                horizontalLineTo(16f)
                curveTo(20f, 18.969f, 22f, 16.969f, 22f, 12.969f)
                verticalLineTo(7.969f)
                curveTo(22f, 3.969f, 20f, 1.969f, 16f, 1.969f)
                close()
                moveTo(8.53f, 12.169f)
                curveTo(8.82f, 12.459f, 8.82f, 12.939f, 8.53f, 13.229f)
                curveTo(8.38f, 13.379f, 8.19f, 13.449f, 8f, 13.449f)
                curveTo(7.81f, 13.449f, 7.62f, 13.379f, 7.47f, 13.229f)
                lineTo(5.47f, 11.229f)
                curveTo(5.18f, 10.939f, 5.18f, 10.459f, 5.47f, 10.169f)
                lineTo(7.47f, 8.169f)
                curveTo(7.76f, 7.879f, 8.24f, 7.879f, 8.53f, 8.169f)
                curveTo(8.82f, 8.459f, 8.82f, 8.939f, 8.53f, 9.229f)
                lineTo(7.06f, 10.699f)
                lineTo(8.53f, 12.169f)
                close()
                moveTo(13.69f, 8.659f)
                lineTo(11.69f, 13.329f)
                curveTo(11.57f, 13.609f, 11.29f, 13.779f, 11f, 13.779f)
                curveTo(10.9f, 13.779f, 10.8f, 13.759f, 10.7f, 13.719f)
                curveTo(10.32f, 13.559f, 10.14f, 13.119f, 10.31f, 12.729f)
                lineTo(12.31f, 8.059f)
                curveTo(12.47f, 7.679f, 12.91f, 7.499f, 13.3f, 7.669f)
                curveTo(13.68f, 7.839f, 13.85f, 8.279f, 13.69f, 8.659f)
                close()
                moveTo(18.53f, 11.229f)
                lineTo(16.53f, 13.229f)
                curveTo(16.38f, 13.379f, 16.19f, 13.449f, 16f, 13.449f)
                curveTo(15.81f, 13.449f, 15.62f, 13.379f, 15.47f, 13.229f)
                curveTo(15.18f, 12.939f, 15.18f, 12.459f, 15.47f, 12.169f)
                lineTo(16.94f, 10.699f)
                lineTo(15.47f, 9.229f)
                curveTo(15.18f, 8.939f, 15.18f, 8.459f, 15.47f, 8.169f)
                curveTo(15.76f, 7.879f, 16.24f, 7.879f, 16.53f, 8.169f)
                lineTo(18.53f, 10.169f)
                curveTo(18.82f, 10.459f, 18.82f, 10.939f, 18.53f, 11.229f)
                close()
            }
        }.build()

        return _MessageProgramming!!
    }

@Suppress("ObjectPropertyName")
private var _MessageProgramming: ImageVector? = null
