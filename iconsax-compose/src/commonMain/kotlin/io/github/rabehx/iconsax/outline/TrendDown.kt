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

val Iconsax.Outline.TrendDown: ImageVector
    get() {
        if (_TrendDown != null) {
            return _TrendDown!!
        }
        _TrendDown = ImageVector.Builder(
            name = "Outline.TrendDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 15.25f)
                curveTo(16.31f, 15.25f, 16.12f, 15.18f, 15.97f, 15.03f)
                lineTo(12.42f, 11.48f)
                lineTo(11.33f, 13.12f)
                curveTo(11.21f, 13.31f, 11f, 13.43f, 10.78f, 13.45f)
                curveTo(10.55f, 13.47f, 10.33f, 13.39f, 10.18f, 13.23f)
                lineTo(6.98f, 10.03f)
                curveTo(6.69f, 9.74f, 6.69f, 9.26f, 6.98f, 8.97f)
                curveTo(7.27f, 8.68f, 7.75f, 8.68f, 8.04f, 8.97f)
                lineTo(10.59f, 11.52f)
                lineTo(11.68f, 9.88f)
                curveTo(11.8f, 9.7f, 12f, 9.58f, 12.23f, 9.55f)
                curveTo(12.46f, 9.53f, 12.68f, 9.61f, 12.83f, 9.77f)
                lineTo(17.03f, 13.97f)
                curveTo(17.32f, 14.26f, 17.32f, 14.74f, 17.03f, 15.03f)
                curveTo(16.88f, 15.18f, 16.69f, 15.25f, 16.5f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 15.25f)
                horizontalLineTo(14.5f)
                curveTo(14.09f, 15.25f, 13.75f, 14.91f, 13.75f, 14.5f)
                curveTo(13.75f, 14.09f, 14.09f, 13.75f, 14.5f, 13.75f)
                horizontalLineTo(15.75f)
                verticalLineTo(12.5f)
                curveTo(15.75f, 12.09f, 16.09f, 11.75f, 16.5f, 11.75f)
                curveTo(16.91f, 11.75f, 17.25f, 12.09f, 17.25f, 12.5f)
                verticalLineTo(14.5f)
                curveTo(17.25f, 14.91f, 16.91f, 15.25f, 16.5f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _TrendDown!!
    }

@Suppress("ObjectPropertyName")
private var _TrendDown: ImageVector? = null
