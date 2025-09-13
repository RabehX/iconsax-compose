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


val Iconsax.Filled.Cpu: ImageVector
    get() {
        if (_Cpu != null) {
            return _Cpu!!
        }
        _Cpu = ImageVector.Builder(
            name = "Filled.Cpu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.25f, 12.75f)
                curveTo(21.67f, 12.75f, 22f, 12.41f, 22f, 12f)
                curveTo(22f, 11.58f, 21.67f, 11.25f, 21.25f, 11.25f)
                horizontalLineTo(20f)
                verticalLineTo(9.05f)
                horizontalLineTo(21.25f)
                curveTo(21.67f, 9.05f, 22f, 8.72f, 22f, 8.3f)
                curveTo(22f, 7.89f, 21.67f, 7.55f, 21.25f, 7.55f)
                horizontalLineTo(19.77f)
                curveTo(19.29f, 5.96f, 18.04f, 4.71f, 16.45f, 4.23f)
                verticalLineTo(2.75f)
                curveTo(16.45f, 2.34f, 16.11f, 2f, 15.7f, 2f)
                curveTo(15.29f, 2f, 14.95f, 2.34f, 14.95f, 2.75f)
                verticalLineTo(4f)
                horizontalLineTo(12.75f)
                verticalLineTo(2.75f)
                curveTo(12.75f, 2.34f, 12.41f, 2f, 12f, 2f)
                curveTo(11.59f, 2f, 11.25f, 2.34f, 11.25f, 2.75f)
                verticalLineTo(4f)
                horizontalLineTo(9.06f)
                verticalLineTo(2.75f)
                curveTo(9.06f, 2.34f, 8.72f, 2f, 8.31f, 2f)
                curveTo(7.89f, 2f, 7.56f, 2.34f, 7.56f, 2.75f)
                verticalLineTo(4.23f)
                curveTo(5.96f, 4.71f, 4.71f, 5.96f, 4.23f, 7.55f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 7.55f, 2f, 7.89f, 2f, 8.3f)
                curveTo(2f, 8.72f, 2.34f, 9.05f, 2.75f, 9.05f)
                horizontalLineTo(4f)
                verticalLineTo(11.25f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 11.25f, 2f, 11.58f, 2f, 12f)
                curveTo(2f, 12.41f, 2.34f, 12.75f, 2.75f, 12.75f)
                horizontalLineTo(4f)
                verticalLineTo(14.95f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 14.95f, 2f, 15.28f, 2f, 15.7f)
                curveTo(2f, 16.11f, 2.34f, 16.45f, 2.75f, 16.45f)
                horizontalLineTo(4.23f)
                curveTo(4.7f, 18.04f, 5.96f, 19.29f, 7.56f, 19.77f)
                verticalLineTo(21.25f)
                curveTo(7.56f, 21.66f, 7.89f, 22f, 8.31f, 22f)
                curveTo(8.72f, 22f, 9.06f, 21.66f, 9.06f, 21.25f)
                verticalLineTo(20f)
                horizontalLineTo(11.26f)
                verticalLineTo(21.25f)
                curveTo(11.26f, 21.66f, 11.59f, 22f, 12.01f, 22f)
                curveTo(12.42f, 22f, 12.76f, 21.66f, 12.76f, 21.25f)
                verticalLineTo(20f)
                horizontalLineTo(14.95f)
                verticalLineTo(21.25f)
                curveTo(14.95f, 21.66f, 15.29f, 22f, 15.7f, 22f)
                curveTo(16.11f, 22f, 16.45f, 21.66f, 16.45f, 21.25f)
                verticalLineTo(19.77f)
                curveTo(18.04f, 19.29f, 19.29f, 18.04f, 19.77f, 16.45f)
                horizontalLineTo(21.25f)
                curveTo(21.67f, 16.45f, 22f, 16.11f, 22f, 15.7f)
                curveTo(22f, 15.28f, 21.67f, 14.95f, 21.25f, 14.95f)
                horizontalLineTo(20f)
                verticalLineTo(12.75f)
                horizontalLineTo(21.25f)
                close()
                moveTo(17.26f, 14.26f)
                curveTo(17.26f, 15.91f, 15.91f, 17.26f, 14.26f, 17.26f)
                horizontalLineTo(9.74f)
                curveTo(8.09f, 17.26f, 6.74f, 15.91f, 6.74f, 14.26f)
                verticalLineTo(9.74f)
                curveTo(6.74f, 8.09f, 8.09f, 6.74f, 9.74f, 6.74f)
                horizontalLineTo(14.26f)
                curveTo(15.91f, 6.74f, 17.26f, 8.09f, 17.26f, 9.74f)
                verticalLineTo(14.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.02f, 16.248f)
                horizontalLineTo(13.99f)
                curveTo(15.24f, 16.248f, 16.26f, 15.238f, 16.26f, 13.978f)
                verticalLineTo(10.008f)
                curveTo(16.26f, 8.758f, 15.25f, 7.738f, 13.99f, 7.738f)
                horizontalLineTo(10.02f)
                curveTo(8.77f, 7.738f, 7.75f, 8.748f, 7.75f, 10.008f)
                verticalLineTo(13.978f)
                curveTo(7.75f, 15.238f, 8.76f, 16.248f, 10.02f, 16.248f)
                close()
            }
        }.build()

        return _Cpu!!
    }

@Suppress("ObjectPropertyName")
private var _Cpu: ImageVector? = null
