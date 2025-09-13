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

val Iconsax.Outline.Tag2: ImageVector
    get() {
        if (_Tag2 != null) {
            return _Tag2!!
        }
        _Tag2 = ImageVector.Builder(
            name = "Outline.Tag2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.069f, 21.98f)
                curveTo(10.659f, 21.98f, 9.239f, 21.44f, 8.169f, 20.37f)
                lineTo(3.639f, 15.84f)
                curveTo(2.539f, 14.74f, 1.959f, 13.22f, 2.029f, 11.67f)
                lineTo(2.269f, 6.66f)
                curveTo(2.379f, 4.27f, 4.269f, 2.38f, 6.669f, 2.26f)
                lineTo(11.669f, 2.02f)
                curveTo(13.229f, 1.95f, 14.739f, 2.53f, 15.839f, 3.63f)
                lineTo(20.369f, 8.16f)
                curveTo(22.519f, 10.31f, 22.519f, 13.82f, 20.369f, 15.97f)
                lineTo(15.979f, 20.36f)
                curveTo(14.899f, 21.44f, 13.489f, 21.98f, 12.069f, 21.98f)
                close()
                moveTo(4.699f, 14.77f)
                lineTo(9.229f, 19.3f)
                curveTo(10.799f, 20.87f, 13.349f, 20.87f, 14.919f, 19.3f)
                lineTo(19.309f, 14.91f)
                curveTo(20.879f, 13.34f, 20.879f, 10.79f, 19.309f, 9.22f)
                lineTo(14.769f, 4.7f)
                curveTo(13.969f, 3.9f, 12.879f, 3.48f, 11.729f, 3.53f)
                lineTo(6.729f, 3.77f)
                curveTo(5.109f, 3.84f, 3.839f, 5.11f, 3.759f, 6.73f)
                lineTo(3.519f, 11.74f)
                curveTo(3.469f, 12.86f, 3.899f, 13.97f, 4.699f, 14.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 12.75f)
                curveTo(7.71f, 12.75f, 6.25f, 11.29f, 6.25f, 9.5f)
                curveTo(6.25f, 7.71f, 7.71f, 6.25f, 9.5f, 6.25f)
                curveTo(11.29f, 6.25f, 12.75f, 7.71f, 12.75f, 9.5f)
                curveTo(12.75f, 11.29f, 11.29f, 12.75f, 9.5f, 12.75f)
                close()
                moveTo(9.5f, 7.75f)
                curveTo(8.54f, 7.75f, 7.75f, 8.54f, 7.75f, 9.5f)
                curveTo(7.75f, 10.46f, 8.54f, 11.25f, 9.5f, 11.25f)
                curveTo(10.46f, 11.25f, 11.25f, 10.46f, 11.25f, 9.5f)
                curveTo(11.25f, 8.54f, 10.46f, 7.75f, 9.5f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 17.75f)
                curveTo(12.809f, 17.75f, 12.62f, 17.68f, 12.469f, 17.53f)
                curveTo(12.179f, 17.24f, 12.179f, 16.76f, 12.469f, 16.47f)
                lineTo(16.469f, 12.47f)
                curveTo(16.76f, 12.18f, 17.24f, 12.18f, 17.529f, 12.47f)
                curveTo(17.819f, 12.76f, 17.819f, 13.24f, 17.529f, 13.53f)
                lineTo(13.53f, 17.53f)
                curveTo(13.38f, 17.68f, 13.189f, 17.75f, 13f, 17.75f)
                close()
            }
        }.build()

        return _Tag2!!
    }

@Suppress("ObjectPropertyName")
private var _Tag2: ImageVector? = null
