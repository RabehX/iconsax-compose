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


val Iconsax.Filled.NoteSquare: ImageVector
    get() {
        if (_NoteSquare != null) {
            return _NoteSquare!!
        }
        _NoteSquare = ImageVector.Builder(
            name = "Filled.NoteSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.619f, 12.099f)
                lineTo(20.999f, 11.889f)
                lineTo(19.329f, 11.339f)
                curveTo(18.749f, 11.149f, 18.159f, 11.219f, 17.709f, 11.539f)
                curveTo(17.269f, 11.869f, 17.009f, 12.399f, 17.009f, 13.019f)
                verticalLineTo(17.809f)
                curveTo(16.609f, 17.589f, 16.159f, 17.449f, 15.669f, 17.449f)
                curveTo(14.129f, 17.449f, 12.879f, 18.709f, 12.879f, 20.249f)
                curveTo(12.879f, 20.509f, 12.919f, 20.759f, 12.979f, 20.999f)
                curveTo(13.309f, 22.189f, 14.389f, 23.049f, 15.669f, 23.049f)
                curveTo(17.199f, 23.049f, 18.439f, 21.829f, 18.469f, 20.309f)
                verticalLineTo(15.699f)
                curveTo(18.489f, 15.699f, 18.499f, 15.709f, 18.519f, 15.719f)
                lineTo(20.799f, 16.479f)
                curveTo(20.839f, 16.489f, 20.889f, 16.509f, 20.929f, 16.509f)
                curveTo(21.109f, 16.559f, 21.269f, 16.579f, 21.439f, 16.579f)
                curveTo(21.799f, 16.579f, 22.139f, 16.479f, 22.419f, 16.269f)
                curveTo(22.869f, 15.949f, 23.119f, 15.419f, 23.119f, 14.799f)
                verticalLineTo(14.199f)
                curveTo(23.119f, 13.289f, 22.479f, 12.389f, 21.619f, 12.099f)
                close()
                moveTo(15.669f, 21.589f)
                curveTo(15.209f, 21.589f, 14.809f, 21.359f, 14.569f, 20.999f)
                curveTo(14.419f, 20.789f, 14.339f, 20.529f, 14.339f, 20.249f)
                curveTo(14.339f, 19.519f, 14.939f, 18.919f, 15.669f, 18.919f)
                curveTo(16.409f, 18.919f, 17.009f, 19.519f, 17.009f, 20.249f)
                curveTo(17.009f, 20.479f, 16.949f, 20.689f, 16.849f, 20.869f)
                curveTo(16.629f, 21.299f, 16.179f, 21.589f, 15.669f, 21.589f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(23.119f, 14.199f)
                verticalLineTo(14.799f)
                curveTo(23.119f, 15.419f, 22.869f, 15.949f, 22.419f, 16.269f)
                curveTo(22.139f, 16.479f, 21.799f, 16.579f, 21.439f, 16.579f)
                curveTo(21.269f, 16.579f, 21.109f, 16.559f, 20.929f, 16.509f)
                curveTo(20.889f, 16.509f, 20.839f, 16.489f, 20.799f, 16.479f)
                lineTo(18.519f, 15.719f)
                curveTo(18.499f, 15.709f, 18.489f, 15.699f, 18.469f, 15.699f)
                verticalLineTo(20.309f)
                curveTo(18.439f, 21.829f, 17.199f, 23.049f, 15.669f, 23.049f)
                curveTo(14.389f, 23.049f, 13.309f, 22.189f, 12.979f, 20.999f)
                curveTo(12.919f, 20.759f, 12.879f, 20.509f, 12.879f, 20.249f)
                curveTo(12.879f, 18.709f, 14.129f, 17.449f, 15.669f, 17.449f)
                curveTo(16.159f, 17.449f, 16.609f, 17.589f, 17.009f, 17.809f)
                verticalLineTo(13.019f)
                curveTo(17.009f, 12.399f, 17.269f, 11.869f, 17.709f, 11.539f)
                curveTo(18.159f, 11.219f, 18.749f, 11.149f, 19.329f, 11.339f)
                lineTo(20.999f, 11.889f)
                lineTo(21.619f, 12.099f)
                curveTo(22.479f, 12.389f, 23.119f, 13.289f, 23.119f, 14.199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 7.52f)
                verticalLineTo(9.62f)
                curveTo(21f, 9.96f, 20.67f, 10.2f, 20.34f, 10.09f)
                lineTo(19.8f, 9.91f)
                curveTo(18.75f, 9.58f, 17.68f, 9.72f, 16.81f, 10.34f)
                curveTo(15.98f, 10.96f, 15.51f, 11.94f, 15.51f, 13.02f)
                verticalLineTo(15.47f)
                curveTo(15.51f, 15.74f, 15.3f, 15.96f, 15.03f, 16f)
                curveTo(12.97f, 16.31f, 11.38f, 18.1f, 11.38f, 20.25f)
                curveTo(11.38f, 20.3f, 11.38f, 20.35f, 11.38f, 20.4f)
                curveTo(11.39f, 20.71f, 11.16f, 21f, 10.84f, 21f)
                horizontalLineTo(7.52f)
                curveTo(4.07f, 21f, 2f, 18.94f, 2f, 15.48f)
                verticalLineTo(7.52f)
                curveTo(2f, 4.06f, 4.07f, 2f, 7.52f, 2f)
                horizontalLineTo(15.48f)
                curveTo(18.93f, 2f, 21f, 4.06f, 21f, 7.52f)
                close()
            }
        }.build()

        return _NoteSquare!!
    }

@Suppress("ObjectPropertyName")
private var _NoteSquare: ImageVector? = null
