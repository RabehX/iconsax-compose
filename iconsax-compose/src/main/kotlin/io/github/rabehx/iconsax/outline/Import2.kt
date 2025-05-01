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

val Iconsax.Outline.Import2: ImageVector
    get() {
        if (_Import2 != null) {
            return _Import2!!
        }
        _Import2 = ImageVector.Builder(
            name = "Outline.Import2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.8f, 10.95f)
                curveTo(13.61f, 10.95f, 13.42f, 10.88f, 13.27f, 10.73f)
                curveTo(12.98f, 10.44f, 12.98f, 9.96f, 13.27f, 9.67f)
                lineTo(21.47f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.53f, 1.47f)
                curveTo(22.82f, 1.76f, 22.82f, 2.24f, 22.53f, 2.53f)
                lineTo(14.33f, 10.73f)
                curveTo(14.19f, 10.87f, 14f, 10.95f, 13.8f, 10.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.83f, 11.75f)
                horizontalLineTo(13f)
                curveTo(12.59f, 11.75f, 12.25f, 11.41f, 12.25f, 11f)
                verticalLineTo(6.17f)
                curveTo(12.25f, 5.76f, 12.59f, 5.42f, 13f, 5.42f)
                curveTo(13.41f, 5.42f, 13.75f, 5.76f, 13.75f, 6.17f)
                verticalLineTo(10.25f)
                horizontalLineTo(17.83f)
                curveTo(18.24f, 10.25f, 18.58f, 10.59f, 18.58f, 11f)
                curveTo(18.58f, 11.41f, 18.24f, 11.75f, 17.83f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(11f)
                curveTo(11.41f, 1.25f, 11.75f, 1.59f, 11.75f, 2f)
                curveTo(11.75f, 2.41f, 11.41f, 2.75f, 11f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(13f)
                curveTo(21.25f, 12.59f, 21.59f, 12.25f, 22f, 12.25f)
                curveTo(22.41f, 12.25f, 22.75f, 12.59f, 22.75f, 13f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
        }.build()

        return _Import2!!
    }

@Suppress("ObjectPropertyName")
private var _Import2: ImageVector? = null
