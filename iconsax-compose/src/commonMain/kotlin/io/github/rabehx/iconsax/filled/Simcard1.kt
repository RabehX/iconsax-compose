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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Simcard1: ImageVector
    get() {
        if (_Simcard1 != null) {
            return _Simcard1!!
        }
        _Simcard1 = ImageVector.Builder(
            name = "Filled.Simcard1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.54f, 6.54f)
                lineTo(16.47f, 3.47f)
                curveTo(15.53f, 2.53f, 14.26f, 2f, 12.93f, 2f)
                horizontalLineTo(8f)
                curveTo(5f, 2f, 3f, 4f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 20f, 5f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(19f, 22f, 21f, 20f, 21f, 17f)
                verticalLineTo(10.07f)
                curveTo(21f, 8.74f, 20.47f, 7.47f, 19.54f, 6.54f)
                close()
                moveTo(11.5f, 18f)
                curveTo(11.5f, 18.276f, 11.276f, 18.5f, 11f, 18.5f)
                horizontalLineTo(10f)
                curveTo(8.35f, 18.5f, 7f, 17.15f, 7f, 15.5f)
                verticalLineTo(15f)
                curveTo(7f, 14.724f, 7.224f, 14.5f, 7.5f, 14.5f)
                horizontalLineTo(11.25f)
                curveTo(11.39f, 14.5f, 11.5f, 14.61f, 11.5f, 14.75f)
                verticalLineTo(18f)
                close()
                moveTo(11.5f, 13.25f)
                curveTo(11.5f, 13.39f, 11.39f, 13.5f, 11.25f, 13.5f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 13.5f, 7f, 13.276f, 7f, 13f)
                verticalLineTo(12.5f)
                curveTo(7f, 10.85f, 8.35f, 9.5f, 10f, 9.5f)
                horizontalLineTo(11f)
                curveTo(11.276f, 9.5f, 11.5f, 9.724f, 11.5f, 10f)
                verticalLineTo(13.25f)
                close()
                moveTo(17f, 15.5f)
                curveTo(17f, 17.15f, 15.65f, 18.5f, 14f, 18.5f)
                horizontalLineTo(13f)
                curveTo(12.724f, 18.5f, 12.5f, 18.276f, 12.5f, 18f)
                verticalLineTo(14.75f)
                curveTo(12.5f, 14.61f, 12.61f, 14.5f, 12.75f, 14.5f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 14.5f, 17f, 14.724f, 17f, 15f)
                verticalLineTo(15.5f)
                close()
                moveTo(17f, 13f)
                curveTo(17f, 13.276f, 16.776f, 13.5f, 16.5f, 13.5f)
                horizontalLineTo(12.75f)
                curveTo(12.61f, 13.5f, 12.5f, 13.39f, 12.5f, 13.25f)
                verticalLineTo(10f)
                curveTo(12.5f, 9.724f, 12.724f, 9.5f, 13f, 9.5f)
                horizontalLineTo(14f)
                curveTo(15.65f, 9.5f, 17f, 10.85f, 17f, 12.5f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Simcard1!!
    }

@Suppress("ObjectPropertyName")
private var _Simcard1: ImageVector? = null
