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

val Iconsax.Outline.Mask2: ImageVector
    get() {
        if (_Mask2 != null) {
            return _Mask2!!
        }
        _Mask2 = ImageVector.Builder(
            name = "Outline.Mask2",
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
                moveTo(12f, 17.75f)
                curveTo(11.59f, 17.75f, 11.25f, 17.41f, 11.25f, 17f)
                verticalLineTo(7f)
                curveTo(11.25f, 6.59f, 11.59f, 6.25f, 12f, 6.25f)
                curveTo(15.17f, 6.25f, 17.75f, 8.83f, 17.75f, 12f)
                curveTo(17.75f, 15.17f, 15.17f, 17.75f, 12f, 17.75f)
                close()
                moveTo(12.75f, 7.82f)
                verticalLineTo(16.19f)
                curveTo(14.74f, 15.84f, 16.25f, 14.09f, 16.25f, 12.01f)
                curveTo(16.25f, 9.93f, 14.74f, 8.17f, 12.75f, 7.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.75f)
                curveTo(8.83f, 17.75f, 6.25f, 15.17f, 6.25f, 12f)
                curveTo(6.25f, 8.83f, 8.83f, 6.25f, 12f, 6.25f)
                curveTo(12.41f, 6.25f, 12.75f, 6.59f, 12.75f, 7f)
                verticalLineTo(17f)
                curveTo(12.75f, 17.41f, 12.41f, 17.75f, 12f, 17.75f)
                close()
                moveTo(11.25f, 7.82f)
                curveTo(9.26f, 8.17f, 7.75f, 9.92f, 7.75f, 12f)
                curveTo(7.75f, 14.08f, 9.26f, 15.83f, 11.25f, 16.18f)
                verticalLineTo(7.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(17f)
                curveTo(11.25f, 16.59f, 11.59f, 16.25f, 12f, 16.25f)
                curveTo(12.41f, 16.25f, 12.75f, 16.59f, 12.75f, 17f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 7.75f)
                curveTo(11.59f, 7.75f, 11.25f, 7.41f, 11.25f, 7f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(7f)
                curveTo(12.75f, 7.41f, 12.41f, 7.75f, 12f, 7.75f)
                close()
            }
        }.build()

        return _Mask2!!
    }

@Suppress("ObjectPropertyName")
private var _Mask2: ImageVector? = null
