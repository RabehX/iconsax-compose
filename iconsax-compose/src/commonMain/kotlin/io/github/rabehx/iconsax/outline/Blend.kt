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

val Iconsax.Outline.Blend: ImageVector
    get() {
        if (_Blend != null) {
            return _Blend!!
        }
        _Blend = ImageVector.Builder(
            name = "Outline.Blend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.971f, 18.75f)
                curveTo(14.301f, 18.75f, 12.701f, 18.13f, 11.471f, 17.02f)
                curveTo(11.311f, 16.88f, 11.221f, 16.67f, 11.221f, 16.46f)
                curveTo(11.221f, 16.25f, 11.311f, 16.04f, 11.471f, 15.9f)
                curveTo(12.581f, 14.92f, 13.221f, 13.5f, 13.221f, 12f)
                curveTo(13.221f, 10.5f, 12.581f, 9.08f, 11.471f, 8.1f)
                curveTo(11.311f, 7.96f, 11.221f, 7.76f, 11.221f, 7.54f)
                curveTo(11.221f, 7.33f, 11.311f, 7.12f, 11.471f, 6.98f)
                curveTo(12.711f, 5.86f, 14.301f, 5.25f, 15.971f, 5.25f)
                curveTo(19.691f, 5.25f, 22.721f, 8.28f, 22.721f, 12f)
                curveTo(22.721f, 15.72f, 19.701f, 18.75f, 15.971f, 18.75f)
                close()
                moveTo(13.101f, 16.39f)
                curveTo(13.951f, 16.95f, 14.941f, 17.25f, 15.981f, 17.25f)
                curveTo(18.871f, 17.25f, 21.231f, 14.89f, 21.231f, 12f)
                curveTo(21.231f, 9.11f, 18.871f, 6.75f, 15.981f, 6.75f)
                curveTo(14.951f, 6.75f, 13.951f, 7.05f, 13.101f, 7.61f)
                curveTo(14.141f, 8.82f, 14.731f, 10.37f, 14.731f, 12f)
                curveTo(14.731f, 13.63f, 14.141f, 15.18f, 13.101f, 16.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.971f, 18.75f)
                curveTo(4.251f, 18.75f, 1.221f, 15.72f, 1.221f, 12f)
                curveTo(1.221f, 8.28f, 4.251f, 5.25f, 7.971f, 5.25f)
                curveTo(9.641f, 5.25f, 11.241f, 5.87f, 12.471f, 6.98f)
                curveTo(13.891f, 8.24f, 14.721f, 10.07f, 14.721f, 12f)
                curveTo(14.721f, 13.93f, 13.901f, 15.75f, 12.471f, 17.02f)
                curveTo(11.241f, 18.13f, 9.641f, 18.75f, 7.971f, 18.75f)
                close()
                moveTo(7.971f, 6.75f)
                curveTo(5.081f, 6.75f, 2.721f, 9.11f, 2.721f, 12f)
                curveTo(2.721f, 14.89f, 5.081f, 17.25f, 7.971f, 17.25f)
                curveTo(9.271f, 17.25f, 10.511f, 16.77f, 11.471f, 15.9f)
                curveTo(12.591f, 14.91f, 13.221f, 13.49f, 13.221f, 12f)
                curveTo(13.221f, 10.51f, 12.581f, 9.08f, 11.471f, 8.1f)
                curveTo(10.511f, 7.23f, 9.271f, 6.75f, 7.971f, 6.75f)
                close()
            }
        }.build()

        return _Blend!!
    }

@Suppress("ObjectPropertyName")
private var _Blend: ImageVector? = null
