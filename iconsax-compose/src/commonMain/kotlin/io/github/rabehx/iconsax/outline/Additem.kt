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

val Iconsax.Outline.Additem: ImageVector
    get() {
        if (_Additem != null) {
            return _Additem!!
        }
        _Additem = ImageVector.Builder(
            name = "Outline.Additem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 16.75f)
                horizontalLineTo(5.43f)
                curveTo(2.74f, 16.75f, 1.25f, 15.27f, 1.25f, 12.57f)
                verticalLineTo(5.43f)
                curveTo(1.25f, 2.74f, 2.73f, 1.25f, 5.43f, 1.25f)
                horizontalLineTo(10f)
                curveTo(12.69f, 1.25f, 14.18f, 2.73f, 14.18f, 5.43f)
                curveTo(14.18f, 5.84f, 13.84f, 6.18f, 13.43f, 6.18f)
                curveTo(13.02f, 6.18f, 12.68f, 5.84f, 12.68f, 5.43f)
                curveTo(12.68f, 3.55f, 11.88f, 2.75f, 10f, 2.75f)
                horizontalLineTo(5.43f)
                curveTo(3.55f, 2.75f, 2.75f, 3.55f, 2.75f, 5.43f)
                verticalLineTo(12.57f)
                curveTo(2.75f, 14.45f, 3.55f, 15.25f, 5.43f, 15.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 15.25f, 8.75f, 15.59f, 8.75f, 16f)
                curveTo(8.75f, 16.41f, 8.41f, 16.75f, 8f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.57f, 22.75f)
                horizontalLineTo(14f)
                curveTo(11.31f, 22.75f, 9.82f, 21.27f, 9.82f, 18.57f)
                verticalLineTo(11.43f)
                curveTo(9.82f, 8.74f, 11.3f, 7.25f, 14f, 7.25f)
                horizontalLineTo(18.57f)
                curveTo(21.26f, 7.25f, 22.75f, 8.73f, 22.75f, 11.43f)
                verticalLineTo(18.57f)
                curveTo(22.75f, 21.27f, 21.27f, 22.75f, 18.57f, 22.75f)
                close()
                moveTo(14f, 8.75f)
                curveTo(12.12f, 8.75f, 11.32f, 9.55f, 11.32f, 11.43f)
                verticalLineTo(18.57f)
                curveTo(11.32f, 20.45f, 12.12f, 21.25f, 14f, 21.25f)
                horizontalLineTo(18.57f)
                curveTo(20.45f, 21.25f, 21.25f, 20.45f, 21.25f, 18.57f)
                verticalLineTo(11.43f)
                curveTo(21.25f, 9.55f, 20.45f, 8.75f, 18.57f, 8.75f)
                horizontalLineTo(14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.131f, 15.75f)
                horizontalLineTo(14.881f)
                curveTo(14.471f, 15.75f, 14.131f, 15.41f, 14.131f, 15f)
                curveTo(14.131f, 14.59f, 14.471f, 14.25f, 14.881f, 14.25f)
                horizontalLineTo(18.131f)
                curveTo(18.541f, 14.25f, 18.881f, 14.59f, 18.881f, 15f)
                curveTo(18.881f, 15.41f, 18.541f, 15.75f, 18.131f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 17.38f)
                curveTo(16.09f, 17.38f, 15.75f, 17.04f, 15.75f, 16.63f)
                verticalLineTo(13.38f)
                curveTo(15.75f, 12.97f, 16.09f, 12.63f, 16.5f, 12.63f)
                curveTo(16.91f, 12.63f, 17.25f, 12.97f, 17.25f, 13.38f)
                verticalLineTo(16.63f)
                curveTo(17.25f, 17.04f, 16.91f, 17.38f, 16.5f, 17.38f)
                close()
            }
        }.build()

        return _Additem!!
    }

@Suppress("ObjectPropertyName")
private var _Additem: ImageVector? = null
