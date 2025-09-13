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

val Iconsax.Outline.Folder2: ImageVector
    get() {
        if (_Folder2 != null) {
            return _Folder2!!
        }
        _Folder2 = ImageVector.Builder(
            name = "Outline.Folder2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(2.59f, 22.75f, 1.25f, 21.41f, 1.25f, 17f)
                verticalLineTo(7f)
                curveTo(1.25f, 2.59f, 2.59f, 1.25f, 7f, 1.25f)
                horizontalLineTo(8.5f)
                curveTo(10.25f, 1.25f, 10.8f, 1.82f, 11.5f, 2.75f)
                lineTo(13f, 4.75f)
                curveTo(13.33f, 5.19f, 13.38f, 5.25f, 14f, 5.25f)
                horizontalLineTo(17f)
                curveTo(21.41f, 5.25f, 22.75f, 6.59f, 22.75f, 11f)
                verticalLineTo(17f)
                curveTo(22.75f, 21.41f, 21.41f, 22.75f, 17f, 22.75f)
                close()
                moveTo(7f, 2.75f)
                curveTo(3.42f, 2.75f, 2.75f, 3.43f, 2.75f, 7f)
                verticalLineTo(17f)
                curveTo(2.75f, 20.57f, 3.42f, 21.25f, 7f, 21.25f)
                horizontalLineTo(17f)
                curveTo(20.58f, 21.25f, 21.25f, 20.57f, 21.25f, 17f)
                verticalLineTo(11f)
                curveTo(21.25f, 7.43f, 20.58f, 6.75f, 17f, 6.75f)
                horizontalLineTo(14f)
                curveTo(12.72f, 6.75f, 12.3f, 6.31f, 11.8f, 5.65f)
                lineTo(10.3f, 3.65f)
                curveTo(9.78f, 2.96f, 9.62f, 2.75f, 8.5f, 2.75f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 7.13f)
                curveTo(19.59f, 7.13f, 19.25f, 6.79f, 19.25f, 6.38f)
                verticalLineTo(5f)
                curveTo(19.25f, 3.42f, 18.58f, 2.75f, 17f, 2.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 2.75f, 7.25f, 2.41f, 7.25f, 2f)
                curveTo(7.25f, 1.59f, 7.59f, 1.25f, 8f, 1.25f)
                horizontalLineTo(17f)
                curveTo(19.42f, 1.25f, 20.75f, 2.58f, 20.75f, 5f)
                verticalLineTo(6.38f)
                curveTo(20.75f, 6.79f, 20.41f, 7.13f, 20f, 7.13f)
                close()
            }
        }.build()

        return _Folder2!!
    }

@Suppress("ObjectPropertyName")
private var _Folder2: ImageVector? = null
