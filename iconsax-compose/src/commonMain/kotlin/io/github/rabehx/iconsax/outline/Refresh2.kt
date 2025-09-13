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

val Iconsax.Outline.Refresh2: ImageVector
    get() {
        if (_Refresh2 != null) {
            return _Refresh2!!
        }
        _Refresh2 = ImageVector.Builder(
            name = "Outline.Refresh2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                curveTo(22f, 17.52f, 17.52f, 22f, 12f, 22f)
                curveTo(6.48f, 22f, 3.11f, 16.44f, 3.11f, 16.44f)
                moveTo(3.11f, 16.44f)
                horizontalLineTo(7.63f)
                moveTo(3.11f, 16.44f)
                verticalLineTo(21.44f)
                moveTo(2f, 12f)
                curveTo(2f, 6.48f, 6.44f, 2f, 12f, 2f)
                curveTo(18.67f, 2f, 22f, 7.56f, 22f, 7.56f)
                moveTo(22f, 7.56f)
                verticalLineTo(2.56f)
                moveTo(22f, 7.56f)
                horizontalLineTo(17.56f)
            }
        }.build()

        return _Refresh2!!
    }

@Suppress("ObjectPropertyName")
private var _Refresh2: ImageVector? = null
