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

val Iconsax.Outline.Tag: ImageVector
    get() {
        if (_Tag != null) {
            return _Tag!!
        }
        _Tag = ImageVector.Builder(
            name = "Outline.Tag",
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
                lineTo(2.269f, 6.67f)
                curveTo(2.379f, 4.28f, 4.269f, 2.39f, 6.669f, 2.27f)
                lineTo(11.669f, 2.03f)
                curveTo(13.219f, 1.97f, 14.739f, 2.54f, 15.839f, 3.64f)
                lineTo(20.369f, 8.17f)
                curveTo(22.519f, 10.32f, 22.519f, 13.83f, 20.369f, 15.98f)
                lineTo(15.979f, 20.37f)
                curveTo(14.899f, 21.44f, 13.489f, 21.98f, 12.069f, 21.98f)
                close()
                moveTo(4.699f, 14.77f)
                lineTo(9.229f, 19.3f)
                curveTo(9.989f, 20.06f, 10.999f, 20.48f, 12.069f, 20.48f)
                curveTo(13.139f, 20.48f, 14.149f, 20.06f, 14.909f, 19.3f)
                lineTo(19.299f, 14.91f)
                curveTo(20.059f, 14.15f, 20.479f, 13.14f, 20.479f, 12.07f)
                curveTo(20.479f, 11f, 20.059f, 9.99f, 19.299f, 9.23f)
                lineTo(14.769f, 4.7f)
                curveTo(13.969f, 3.9f, 12.859f, 3.47f, 11.739f, 3.53f)
                lineTo(6.739f, 3.77f)
                curveTo(5.109f, 3.84f, 3.839f, 5.11f, 3.759f, 6.73f)
                lineTo(3.519f, 11.73f)
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
        }.build()

        return _Tag!!
    }

@Suppress("ObjectPropertyName")
private var _Tag: ImageVector? = null
