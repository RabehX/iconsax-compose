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

val Iconsax.Outline.Icon: ImageVector
    get() {
        if (_Icon != null) {
            return _Icon!!
        }
        _Icon = ImageVector.Builder(
            name = "Outline.Icon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(7.121f, 22.75f, 3.151f, 18.78f, 3.151f, 13.9f)
                curveTo(3.121f, 8.17f, 8.581f, 3.4f, 10.931f, 1.61f)
                curveTo(11.561f, 1.13f, 12.441f, 1.13f, 13.071f, 1.61f)
                curveTo(15.42f, 3.43f, 20.881f, 8.26f, 20.851f, 13.91f)
                curveTo(20.851f, 18.78f, 16.881f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(11.95f, 2.75f, 11.891f, 2.77f, 11.84f, 2.81f)
                curveTo(10.151f, 4.1f, 4.631f, 8.71f, 4.661f, 13.9f)
                curveTo(4.661f, 17.96f, 7.961f, 21.25f, 12.01f, 21.25f)
                curveTo(16.06f, 21.25f, 19.361f, 17.96f, 19.361f, 13.91f)
                curveTo(19.39f, 8.79f, 13.861f, 4.12f, 12.16f, 2.81f)
                curveTo(12.101f, 2.77f, 12.05f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _Icon!!
    }

@Suppress("ObjectPropertyName")
private var _Icon: ImageVector? = null
