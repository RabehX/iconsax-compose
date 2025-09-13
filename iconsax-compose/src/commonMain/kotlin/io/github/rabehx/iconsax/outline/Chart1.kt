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

val Iconsax.Outline.Chart1: ImageVector
    get() {
        if (_Chart1 != null) {
            return _Chart1!!
        }
        _Chart1 = ImageVector.Builder(
            name = "Outline.Chart1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22f)
                curveTo(1.25f, 21.59f, 1.59f, 21.25f, 2f, 21.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 21.25f, 22.75f, 21.59f, 22.75f, 22f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.25f, 22.75f)
                horizontalLineTo(9.75f)
                curveTo(9.34f, 22.75f, 9f, 22.41f, 9f, 22f)
                verticalLineTo(4f)
                curveTo(9f, 2.28f, 9.95f, 1.25f, 11.55f, 1.25f)
                horizontalLineTo(12.45f)
                curveTo(14.05f, 1.25f, 15f, 2.28f, 15f, 4f)
                verticalLineTo(22f)
                curveTo(15f, 22.41f, 14.66f, 22.75f, 14.25f, 22.75f)
                close()
                moveTo(10.5f, 21.25f)
                horizontalLineTo(13.5f)
                verticalLineTo(4f)
                curveTo(13.5f, 2.85f, 12.96f, 2.75f, 12.45f, 2.75f)
                horizontalLineTo(11.55f)
                curveTo(11.04f, 2.75f, 10.5f, 2.85f, 10.5f, 4f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 22.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 22.75f, 2.25f, 22.41f, 2.25f, 22f)
                verticalLineTo(10f)
                curveTo(2.25f, 8.28f, 3.13f, 7.25f, 4.6f, 7.25f)
                horizontalLineTo(5.4f)
                curveTo(6.87f, 7.25f, 7.75f, 8.28f, 7.75f, 10f)
                verticalLineTo(22f)
                curveTo(7.75f, 22.41f, 7.41f, 22.75f, 7f, 22.75f)
                close()
                moveTo(3.75f, 21.25f)
                horizontalLineTo(6.25f)
                verticalLineTo(10f)
                curveTo(6.25f, 8.75f, 5.7f, 8.75f, 5.4f, 8.75f)
                horizontalLineTo(4.6f)
                curveTo(4.3f, 8.75f, 3.75f, 8.75f, 3.75f, 10f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 22.75f)
                horizontalLineTo(17f)
                curveTo(16.59f, 22.75f, 16.25f, 22.41f, 16.25f, 22f)
                verticalLineTo(15f)
                curveTo(16.25f, 13.28f, 17.13f, 12.25f, 18.6f, 12.25f)
                horizontalLineTo(19.4f)
                curveTo(20.87f, 12.25f, 21.75f, 13.28f, 21.75f, 15f)
                verticalLineTo(22f)
                curveTo(21.75f, 22.41f, 21.41f, 22.75f, 21f, 22.75f)
                close()
                moveTo(17.75f, 21.25f)
                horizontalLineTo(20.25f)
                verticalLineTo(15f)
                curveTo(20.25f, 13.75f, 19.7f, 13.75f, 19.4f, 13.75f)
                horizontalLineTo(18.6f)
                curveTo(18.3f, 13.75f, 17.75f, 13.75f, 17.75f, 15f)
                verticalLineTo(21.25f)
                close()
            }
        }.build()

        return _Chart1!!
    }

@Suppress("ObjectPropertyName")
private var _Chart1: ImageVector? = null
