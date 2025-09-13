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

val Iconsax.Outline.DocumentLike: ImageVector
    get() {
        if (_DocumentLike != null) {
            return _DocumentLike!!
        }
        _DocumentLike = ImageVector.Builder(
            name = "Outline.DocumentLike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(4.35f, 22.75f, 2.25f, 20.65f, 2.25f, 17f)
                verticalLineTo(7f)
                curveTo(2.25f, 3.35f, 4.35f, 1.25f, 8f, 1.25f)
                horizontalLineTo(16f)
                curveTo(19.65f, 1.25f, 21.75f, 3.35f, 21.75f, 7f)
                verticalLineTo(17f)
                curveTo(21.75f, 20.65f, 19.65f, 22.75f, 16f, 22.75f)
                close()
                moveTo(8f, 2.75f)
                curveTo(5.14f, 2.75f, 3.75f, 4.14f, 3.75f, 7f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.86f, 5.14f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(18.86f, 21.25f, 20.25f, 19.86f, 20.25f, 17f)
                verticalLineTo(7f)
                curveTo(20.25f, 4.14f, 18.86f, 2.75f, 16f, 2.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 9.25f)
                horizontalLineTo(16.5f)
                curveTo(14.98f, 9.25f, 13.75f, 8.02f, 13.75f, 6.5f)
                verticalLineTo(4.5f)
                curveTo(13.75f, 4.09f, 14.09f, 3.75f, 14.5f, 3.75f)
                curveTo(14.91f, 3.75f, 15.25f, 4.09f, 15.25f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(15.25f, 7.19f, 15.81f, 7.75f, 16.5f, 7.75f)
                horizontalLineTo(18.5f)
                curveTo(18.91f, 7.75f, 19.25f, 8.09f, 19.25f, 8.5f)
                curveTo(19.25f, 8.91f, 18.91f, 9.25f, 18.5f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.269f, 18.72f)
                curveTo(9.389f, 18.7f, 7.379f, 17.63f, 6.769f, 15.72f)
                curveTo(6.339f, 14.39f, 6.839f, 12.63f, 8.379f, 12.13f)
                curveTo(9.039f, 11.92f, 9.719f, 12.01f, 10.259f, 12.35f)
                curveTo(10.799f, 12.01f, 11.489f, 11.92f, 12.159f, 12.13f)
                curveTo(13.699f, 12.63f, 14.199f, 14.38f, 13.789f, 15.72f)
                curveTo(13.169f, 17.7f, 11.039f, 18.72f, 10.269f, 18.72f)
                close()
                moveTo(8.199f, 15.26f)
                curveTo(8.619f, 16.55f, 10.049f, 17.19f, 10.309f, 17.22f)
                curveTo(10.579f, 17.19f, 11.979f, 16.5f, 12.359f, 15.26f)
                curveTo(12.559f, 14.6f, 12.349f, 13.76f, 11.699f, 13.55f)
                curveTo(11.439f, 13.47f, 11.069f, 13.51f, 10.899f, 13.77f)
                curveTo(10.769f, 13.98f, 10.529f, 14.11f, 10.289f, 14.11f)
                curveTo(9.999f, 14.11f, 9.809f, 14f, 9.659f, 13.79f)
                curveTo(9.459f, 13.51f, 9.099f, 13.47f, 8.839f, 13.55f)
                curveTo(8.199f, 13.76f, 7.989f, 14.61f, 8.199f, 15.26f)
                close()
            }
        }.build()

        return _DocumentLike!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentLike: ImageVector? = null
