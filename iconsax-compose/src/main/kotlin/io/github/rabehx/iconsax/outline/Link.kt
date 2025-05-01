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

val Iconsax.Outline.Link: ImageVector
    get() {
        if (_Link != null) {
            return _Link!!
        }
        _Link = ImageVector.Builder(
            name = "Outline.Link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.75f, 18.5f)
                curveTo(4.17f, 18.5f, 1.25f, 15.58f, 1.25f, 12f)
                curveTo(1.25f, 8.42f, 4.17f, 5.5f, 7.75f, 5.5f)
                curveTo(8.16f, 5.5f, 8.5f, 5.84f, 8.5f, 6.25f)
                curveTo(8.5f, 6.66f, 8.16f, 7f, 7.75f, 7f)
                curveTo(4.99f, 7f, 2.75f, 9.24f, 2.75f, 12f)
                curveTo(2.75f, 14.76f, 4.99f, 17f, 7.75f, 17f)
                curveTo(10.51f, 17f, 12.75f, 14.76f, 12.75f, 12f)
                curveTo(12.75f, 11.59f, 13.09f, 11.25f, 13.5f, 11.25f)
                curveTo(13.91f, 11.25f, 14.25f, 11.59f, 14.25f, 12f)
                curveTo(14.25f, 15.58f, 11.33f, 18.5f, 7.75f, 18.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 18.75f)
                curveTo(15.59f, 18.75f, 15.25f, 18.41f, 15.25f, 18f)
                curveTo(15.25f, 17.59f, 15.59f, 17.25f, 16f, 17.25f)
                curveTo(18.89f, 17.25f, 21.25f, 14.89f, 21.25f, 12f)
                curveTo(21.25f, 9.11f, 18.89f, 6.75f, 16f, 6.75f)
                curveTo(13.11f, 6.75f, 10.75f, 9.11f, 10.75f, 12f)
                curveTo(10.75f, 12.41f, 10.41f, 12.75f, 10f, 12.75f)
                curveTo(9.59f, 12.75f, 9.25f, 12.41f, 9.25f, 12f)
                curveTo(9.25f, 8.28f, 12.28f, 5.25f, 16f, 5.25f)
                curveTo(19.72f, 5.25f, 22.75f, 8.28f, 22.75f, 12f)
                curveTo(22.75f, 15.72f, 19.72f, 18.75f, 16f, 18.75f)
                close()
            }
        }.build()

        return _Link!!
    }

@Suppress("ObjectPropertyName")
private var _Link: ImageVector? = null
