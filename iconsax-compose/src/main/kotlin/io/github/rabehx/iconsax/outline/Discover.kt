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

val Iconsax.Outline.Discover: ImageVector
    get() {
        if (_Discover != null) {
            return _Discover!!
        }
        _Discover = ImageVector.Builder(
            name = "Outline.Discover",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.5f, 16.75f)
                curveTo(8.71f, 16.75f, 7.25f, 15.29f, 7.25f, 13.5f)
                curveTo(7.25f, 10.05f, 10.05f, 7.25f, 13.5f, 7.25f)
                curveTo(15.29f, 7.25f, 16.75f, 8.71f, 16.75f, 10.5f)
                curveTo(16.75f, 13.95f, 13.95f, 16.75f, 10.5f, 16.75f)
                close()
                moveTo(13.5f, 8.75f)
                curveTo(10.88f, 8.75f, 8.75f, 10.88f, 8.75f, 13.5f)
                curveTo(8.75f, 14.46f, 9.54f, 15.25f, 10.5f, 15.25f)
                curveTo(13.12f, 15.25f, 15.25f, 13.12f, 15.25f, 10.5f)
                curveTo(15.25f, 9.54f, 14.46f, 8.75f, 13.5f, 8.75f)
                close()
            }
        }.build()

        return _Discover!!
    }

@Suppress("ObjectPropertyName")
private var _Discover: ImageVector? = null
