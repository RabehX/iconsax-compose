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

val Iconsax.Outline.Buildings: ImageVector
    get() {
        if (_Buildings != null) {
            return _Buildings!!
        }
        _Buildings = ImageVector.Builder(
            name = "Outline.Buildings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 22.75f)
                horizontalLineTo(5f)
                curveTo(2.58f, 22.75f, 1.25f, 21.42f, 1.25f, 19f)
                verticalLineTo(11f)
                curveTo(1.25f, 8.58f, 2.58f, 7.25f, 5f, 7.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 7.25f, 10.75f, 7.59f, 10.75f, 8f)
                verticalLineTo(19f)
                curveTo(10.75f, 20.58f, 11.42f, 21.25f, 13f, 21.25f)
                curveTo(13.41f, 21.25f, 13.75f, 21.59f, 13.75f, 22f)
                curveTo(13.75f, 22.41f, 13.41f, 22.75f, 13f, 22.75f)
                close()
                moveTo(5f, 8.75f)
                curveTo(3.42f, 8.75f, 2.75f, 9.42f, 2.75f, 11f)
                verticalLineTo(19f)
                curveTo(2.75f, 20.58f, 3.42f, 21.25f, 5f, 21.25f)
                horizontalLineTo(9.8f)
                curveTo(9.44f, 20.66f, 9.25f, 19.91f, 9.25f, 19f)
                verticalLineTo(8.75f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 8.75f)
                horizontalLineTo(5f)
                curveTo(4.59f, 8.75f, 4.25f, 8.41f, 4.25f, 8f)
                verticalLineTo(6f)
                curveTo(4.25f, 4.48f, 5.48f, 3.25f, 7f, 3.25f)
                horizontalLineTo(10.11f)
                curveTo(10.34f, 3.25f, 10.56f, 3.36f, 10.7f, 3.54f)
                curveTo(10.84f, 3.73f, 10.89f, 3.97f, 10.83f, 4.19f)
                curveTo(10.77f, 4.41f, 10.75f, 4.66f, 10.75f, 5f)
                verticalLineTo(8f)
                curveTo(10.75f, 8.41f, 10.41f, 8.75f, 10f, 8.75f)
                close()
                moveTo(5.75f, 7.25f)
                horizontalLineTo(9.25f)
                verticalLineTo(5f)
                curveTo(9.25f, 4.91f, 9.25f, 4.83f, 9.25f, 4.75f)
                horizontalLineTo(7f)
                curveTo(6.31f, 4.75f, 5.75f, 5.31f, 5.75f, 6f)
                verticalLineTo(7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 13.75f)
                curveTo(13.59f, 13.75f, 13.25f, 13.41f, 13.25f, 13f)
                verticalLineTo(8f)
                curveTo(13.25f, 7.59f, 13.59f, 7.25f, 14f, 7.25f)
                curveTo(14.41f, 7.25f, 14.75f, 7.59f, 14.75f, 8f)
                verticalLineTo(13f)
                curveTo(14.75f, 13.41f, 14.41f, 13.75f, 14f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 13.75f)
                curveTo(17.59f, 13.75f, 17.25f, 13.41f, 17.25f, 13f)
                verticalLineTo(8f)
                curveTo(17.25f, 7.59f, 17.59f, 7.25f, 18f, 7.25f)
                curveTo(18.41f, 7.25f, 18.75f, 7.59f, 18.75f, 8f)
                verticalLineTo(13f)
                curveTo(18.75f, 13.41f, 18.41f, 13.75f, 18f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 22.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 22.75f, 13.25f, 22.41f, 13.25f, 22f)
                verticalLineTo(18f)
                curveTo(13.25f, 17.04f, 14.04f, 16.25f, 15f, 16.25f)
                horizontalLineTo(17f)
                curveTo(17.96f, 16.25f, 18.75f, 17.04f, 18.75f, 18f)
                verticalLineTo(22f)
                curveTo(18.75f, 22.41f, 18.41f, 22.75f, 18f, 22.75f)
                close()
                moveTo(14.75f, 21.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(18f)
                curveTo(17.25f, 17.86f, 17.14f, 17.75f, 17f, 17.75f)
                horizontalLineTo(15f)
                curveTo(14.86f, 17.75f, 14.75f, 17.86f, 14.75f, 18f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 17.75f)
                curveTo(5.59f, 17.75f, 5.25f, 17.41f, 5.25f, 17f)
                verticalLineTo(13f)
                curveTo(5.25f, 12.59f, 5.59f, 12.25f, 6f, 12.25f)
                curveTo(6.41f, 12.25f, 6.75f, 12.59f, 6.75f, 13f)
                verticalLineTo(17f)
                curveTo(6.75f, 17.41f, 6.41f, 17.75f, 6f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                horizontalLineTo(13f)
                curveTo(10.58f, 22.75f, 9.25f, 21.42f, 9.25f, 19f)
                verticalLineTo(5f)
                curveTo(9.25f, 2.58f, 10.58f, 1.25f, 13f, 1.25f)
                horizontalLineTo(19f)
                curveTo(21.42f, 1.25f, 22.75f, 2.58f, 22.75f, 5f)
                verticalLineTo(19f)
                curveTo(22.75f, 21.42f, 21.42f, 22.75f, 19f, 22.75f)
                close()
                moveTo(13f, 2.75f)
                curveTo(11.42f, 2.75f, 10.75f, 3.42f, 10.75f, 5f)
                verticalLineTo(19f)
                curveTo(10.75f, 20.58f, 11.42f, 21.25f, 13f, 21.25f)
                horizontalLineTo(19f)
                curveTo(20.58f, 21.25f, 21.25f, 20.58f, 21.25f, 19f)
                verticalLineTo(5f)
                curveTo(21.25f, 3.42f, 20.58f, 2.75f, 19f, 2.75f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _Buildings!!
    }

@Suppress("ObjectPropertyName")
private var _Buildings: ImageVector? = null
