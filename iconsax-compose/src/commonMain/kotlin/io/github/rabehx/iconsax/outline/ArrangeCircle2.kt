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

val Iconsax.Outline.ArrangeCircle2: ImageVector
    get() {
        if (_ArrangeCircle2 != null) {
            return _ArrangeCircle2!!
        }
        _ArrangeCircle2 = ImageVector.Builder(
            name = "Outline.ArrangeCircle2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.111f, 17.61f)
                curveTo(13.921f, 17.61f, 13.731f, 17.54f, 13.581f, 17.39f)
                curveTo(13.291f, 17.1f, 13.291f, 16.62f, 13.581f, 16.33f)
                lineTo(16.621f, 13.29f)
                curveTo(16.911f, 13f, 17.391f, 13f, 17.681f, 13.29f)
                curveTo(17.971f, 13.58f, 17.971f, 14.06f, 17.681f, 14.35f)
                lineTo(14.641f, 17.39f)
                curveTo(14.501f, 17.53f, 14.311f, 17.61f, 14.111f, 17.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.15f, 14.57f)
                horizontalLineTo(6.84f)
                curveTo(6.43f, 14.57f, 6.09f, 14.23f, 6.09f, 13.82f)
                curveTo(6.09f, 13.41f, 6.43f, 13.07f, 6.84f, 13.07f)
                horizontalLineTo(17.15f)
                curveTo(17.56f, 13.07f, 17.9f, 13.41f, 17.9f, 13.82f)
                curveTo(17.9f, 14.23f, 17.57f, 14.57f, 17.15f, 14.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.849f, 10.93f)
                curveTo(6.659f, 10.93f, 6.469f, 10.86f, 6.319f, 10.71f)
                curveTo(6.029f, 10.42f, 6.029f, 9.94f, 6.319f, 9.65f)
                lineTo(9.359f, 6.61f)
                curveTo(9.649f, 6.32f, 10.129f, 6.32f, 10.419f, 6.61f)
                curveTo(10.709f, 6.9f, 10.709f, 7.38f, 10.419f, 7.67f)
                lineTo(7.379f, 10.71f)
                curveTo(7.229f, 10.86f, 7.039f, 10.93f, 6.849f, 10.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.15f, 10.93f)
                horizontalLineTo(6.84f)
                curveTo(6.43f, 10.93f, 6.09f, 10.59f, 6.09f, 10.18f)
                curveTo(6.09f, 9.77f, 6.43f, 9.43f, 6.84f, 9.43f)
                horizontalLineTo(17.15f)
                curveTo(17.56f, 9.43f, 17.9f, 9.77f, 17.9f, 10.18f)
                curveTo(17.9f, 10.59f, 17.57f, 10.93f, 17.15f, 10.93f)
                close()
            }
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
        }.build()

        return _ArrangeCircle2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrangeCircle2: ImageVector? = null
