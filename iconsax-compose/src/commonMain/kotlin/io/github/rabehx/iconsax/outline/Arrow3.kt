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

val Iconsax.Outline.Arrow3: ImageVector
    get() {
        if (_Arrow3 != null) {
            return _Arrow3!!
        }
        _Arrow3 = ImageVector.Builder(
            name = "Outline.Arrow3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.449f, 7.47f)
                curveTo(10.259f, 7.47f, 10.069f, 7.4f, 9.919f, 7.25f)
                lineTo(6.729f, 4.06f)
                lineTo(3.539f, 7.25f)
                curveTo(3.249f, 7.54f, 2.769f, 7.54f, 2.479f, 7.25f)
                curveTo(2.189f, 6.96f, 2.189f, 6.48f, 2.479f, 6.19f)
                lineTo(6.199f, 2.47f)
                curveTo(6.339f, 2.33f, 6.529f, 2.25f, 6.729f, 2.25f)
                curveTo(6.929f, 2.25f, 7.119f, 2.33f, 7.259f, 2.47f)
                lineTo(10.979f, 6.19f)
                curveTo(11.269f, 6.48f, 11.269f, 6.96f, 10.979f, 7.25f)
                curveTo(10.829f, 7.4f, 10.639f, 7.47f, 10.449f, 7.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.73f, 21.75f)
                curveTo(6.32f, 21.75f, 5.98f, 21.41f, 5.98f, 21f)
                verticalLineTo(3f)
                curveTo(5.98f, 2.59f, 6.32f, 2.25f, 6.73f, 2.25f)
                curveTo(7.14f, 2.25f, 7.48f, 2.59f, 7.48f, 3f)
                verticalLineTo(21f)
                curveTo(7.48f, 21.41f, 7.14f, 21.75f, 6.73f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.28f, 21.75f)
                curveTo(17.08f, 21.75f, 16.89f, 21.67f, 16.75f, 21.53f)
                lineTo(13.03f, 17.81f)
                curveTo(12.74f, 17.52f, 12.74f, 17.04f, 13.03f, 16.75f)
                curveTo(13.32f, 16.46f, 13.8f, 16.46f, 14.09f, 16.75f)
                lineTo(17.28f, 19.94f)
                lineTo(20.47f, 16.75f)
                curveTo(20.76f, 16.46f, 21.24f, 16.46f, 21.53f, 16.75f)
                curveTo(21.82f, 17.04f, 21.82f, 17.52f, 21.53f, 17.81f)
                lineTo(17.81f, 21.53f)
                curveTo(17.67f, 21.67f, 17.47f, 21.75f, 17.28f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.27f, 21.75f)
                curveTo(16.86f, 21.75f, 16.52f, 21.41f, 16.52f, 21f)
                verticalLineTo(3f)
                curveTo(16.52f, 2.59f, 16.86f, 2.25f, 17.27f, 2.25f)
                curveTo(17.68f, 2.25f, 18.02f, 2.59f, 18.02f, 3f)
                verticalLineTo(21f)
                curveTo(18.02f, 21.41f, 17.69f, 21.75f, 17.27f, 21.75f)
                close()
            }
        }.build()

        return _Arrow3!!
    }

@Suppress("ObjectPropertyName")
private var _Arrow3: ImageVector? = null
