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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.UserSquare: ImageVector
    get() {
        if (_UserSquare != null) {
            return _UserSquare!!
        }
        _UserSquare = ImageVector.Builder(
            name = "Outline.UserSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.001f, 22.75f)
                horizontalLineTo(9.001f)
                curveTo(7.681f, 22.75f, 6.581f, 22.62f, 5.651f, 22.34f)
                curveTo(5.311f, 22.24f, 5.091f, 21.91f, 5.111f, 21.56f)
                curveTo(5.361f, 18.57f, 8.391f, 16.22f, 12.001f, 16.22f)
                curveTo(15.611f, 16.22f, 18.631f, 18.56f, 18.891f, 21.56f)
                curveTo(18.921f, 21.92f, 18.701f, 22.24f, 18.351f, 22.34f)
                curveTo(17.421f, 22.62f, 16.321f, 22.75f, 15.001f, 22.75f)
                close()
                moveTo(6.721f, 21.06f)
                curveTo(7.381f, 21.19f, 8.131f, 21.25f, 9.001f, 21.25f)
                horizontalLineTo(15.001f)
                curveTo(15.871f, 21.25f, 16.621f, 21.19f, 17.281f, 21.06f)
                curveTo(16.751f, 19.14f, 14.561f, 17.72f, 12.001f, 17.72f)
                curveTo(9.441f, 17.72f, 7.251f, 19.14f, 6.721f, 21.06f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 18.78f, 3.14f, 20.85f, 5.86f, 21.62f)
                curveTo(6.08f, 19.02f, 8.75f, 16.97f, 12f, 16.97f)
                curveTo(15.25f, 16.97f, 17.92f, 19.02f, 18.14f, 21.62f)
                curveTo(20.86f, 20.85f, 22f, 18.78f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                close()
                moveTo(12f, 14.17f)
                curveTo(10.02f, 14.17f, 8.42f, 12.56f, 8.42f, 10.58f)
                curveTo(8.42f, 8.6f, 10.02f, 7f, 12f, 7f)
                curveTo(13.98f, 7f, 15.58f, 8.6f, 15.58f, 10.58f)
                curveTo(15.58f, 12.56f, 13.98f, 14.17f, 12f, 14.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.92f)
                curveTo(9.61f, 14.92f, 7.67f, 12.97f, 7.67f, 10.58f)
                curveTo(7.67f, 8.19f, 9.61f, 6.25f, 12f, 6.25f)
                curveTo(14.39f, 6.25f, 16.33f, 8.19f, 16.33f, 10.58f)
                curveTo(16.33f, 12.97f, 14.39f, 14.92f, 12f, 14.92f)
                close()
                moveTo(12f, 7.75f)
                curveTo(10.44f, 7.75f, 9.17f, 9.02f, 9.17f, 10.58f)
                curveTo(9.17f, 12.15f, 10.44f, 13.42f, 12f, 13.42f)
                curveTo(13.56f, 13.42f, 14.83f, 12.15f, 14.83f, 10.58f)
                curveTo(14.83f, 9.02f, 13.56f, 7.75f, 12f, 7.75f)
                close()
            }
        }.build()

        return _UserSquare!!
    }

@Suppress("ObjectPropertyName")
private var _UserSquare: ImageVector? = null
