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

val Iconsax.Outline.Woman: ImageVector
    get() {
        if (_Woman != null) {
            return _Woman!!
        }
        _Woman = ImageVector.Builder(
            name = "Outline.Woman",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.75f)
                curveTo(7.73f, 16.75f, 4.25f, 13.27f, 4.25f, 9f)
                curveTo(4.25f, 4.73f, 7.73f, 1.25f, 12f, 1.25f)
                curveTo(16.27f, 1.25f, 19.75f, 4.73f, 19.75f, 9f)
                curveTo(19.75f, 13.27f, 16.27f, 16.75f, 12f, 16.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(8.55f, 2.75f, 5.75f, 5.55f, 5.75f, 9f)
                curveTo(5.75f, 12.45f, 8.55f, 15.25f, 12f, 15.25f)
                curveTo(15.45f, 15.25f, 18.25f, 12.45f, 18.25f, 9f)
                curveTo(18.25f, 5.55f, 15.45f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(16f)
                curveTo(11.25f, 15.59f, 11.59f, 15.25f, 12f, 15.25f)
                curveTo(12.41f, 15.25f, 12.75f, 15.59f, 12.75f, 16f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 19.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 19.75f, 8.25f, 19.41f, 8.25f, 19f)
                curveTo(8.25f, 18.59f, 8.59f, 18.25f, 9f, 18.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 18.25f, 15.75f, 18.59f, 15.75f, 19f)
                curveTo(15.75f, 19.41f, 15.41f, 19.75f, 15f, 19.75f)
                close()
            }
        }.build()

        return _Woman!!
    }

@Suppress("ObjectPropertyName")
private var _Woman: ImageVector? = null
